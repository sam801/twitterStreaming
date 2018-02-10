package com.twitterstreaming;

import com.google.gson.Gson;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.endpoint.StatusesSampleEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.BasicClient;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;
import com.twitterstreaming.dao.TwitterDao;
import com.twitterstreaming.model.Twitter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TwitterStreaming {
	private static String consumerKey = "46Dz3NbUZ4EnZnzmUjclSL7Ci";
	private static String consumerSecret = "OpigqjT2hUruK9YDVfJah2UzYgbsi7kZfs88NUpNJJ9rbrY0ZZ";
	private static String token = "805219579698040832-L6Jl2qpxsiooHrGmBxq3NAgVNHeXyr1";
	private static String secret = "fzZNZsv8jgYsEdHqTmTGtnEf8TU8XPMGhN9KRlemgxKjH";
	private TwitterDao twitterDao;
	private static long friendsCount;
	private static String name;
	private static String screenName;

	public static void run(String consumerKey, String consumerSecret,
			String token, String secret) throws InterruptedException {
		// Create an appropriately sized blocking queue
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10000);

		// Define our endpoint: By default, delimited=length is set (we need
		// this for our processor)
		// and stall warnings are on.
		StatusesSampleEndpoint endpoint = new StatusesSampleEndpoint();
		endpoint.stallWarnings(false);

		Authentication auth = new OAuth1(consumerKey, consumerSecret, token,
				secret);
		// Authentication auth = new
		// com.twitter.hbc.httpclient.auth.BasicAuth(username, password);

		// Create a new BasicClient. By default gzip is enabled.
		BasicClient client = new ClientBuilder().name("sampleExampleClient")
				.hosts(Constants.STREAM_HOST).endpoint(endpoint)
				.authentication(auth)
				.processor(new StringDelimitedProcessor(queue)).build();

		// Establish a connection
		client.connect();

		// Do whatever needs to be done with messages
		for (int msgRead = 0; msgRead < 1000; msgRead++) {
			if (client.isDone()) {
				System.out.println("Client connection closed unexpectedly: "
						+ client.getExitEvent().getMessage());
				break;
			}

			String msg = queue.poll(5, TimeUnit.SECONDS);
			if (msg == null) {
				System.out.println("Did not receive a message in 5 seconds");
			} else {
				System.out.println(msg);
				Gson gson = new Gson();
				Twitter tw = gson.fromJson(msg, Twitter.class);
				System.out.println("tw " + tw.getCreatedAt());
				String createdAt = tw.getCreatedAt();

				System.out.println("tw " + tw.getId());
				long id = tw.getId();

				System.out.println("tw " + tw.getText());
				String text = tw.getText();

				if (tw.getUser() != null) {

					System.out.println("tw " + tw.getUser().getFriendsCount());
					friendsCount = tw.getUser().getFriendsCount();
					System.out.println("tw " + tw.getUser().getName());
				    name = tw.getUser().getName();
					System.out.println("tw " + tw.getUser().getScreenName());
					screenName = tw.getUser().getScreenName();

				}

				try {

					String query = " insert into twitter_record_1 (id, name, screenName, friendsCount, text, createdAt)"
							+ " values (?, ?, ?, ?, ?, ?)";
					// create the mysql insert preparedstatement
					Connection conn;
					TwitterDao twitterDao = new TwitterDao();
					conn = twitterDao.getMySqlConnection();
					PreparedStatement preparedStmt = conn
							.prepareStatement(query);
					preparedStmt.setLong(1, id);
					preparedStmt.setString(2, name);
					preparedStmt.setString(3, screenName);
					preparedStmt.setLong(4, friendsCount);
					preparedStmt.setString(5, text);
					preparedStmt.setString(6, createdAt);
					preparedStmt.execute();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.err.println("Got an exception!");
					System.err.println(e.getMessage());
				}

			}
		}

		client.stop();

		// Print some stats
		System.out.printf("The client read %d messages!\n", client
				.getStatsTracker().getNumMessages());
	}

	public static void main(String[] args) {
		try {
			// SampleStreamExample.run(args[0], args[1], args[2], args[3]);
			TwitterStreaming.run(consumerKey, consumerSecret, token, secret);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}