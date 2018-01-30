package com.twitterstreaming.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetweetedStatus {

@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("id")
@Expose
private long id;
@SerializedName("id_str")
@Expose
private String idStr;
@SerializedName("text")
@Expose
private String text;
@SerializedName("display_text_range")
@Expose
private List<Long> displayTextRange = null;
@SerializedName("source")
@Expose
private String source;
@SerializedName("truncated")
@Expose
private boolean truncated;
@SerializedName("in_reply_to_status_id")
@Expose
private Object inReplyToStatusId;
@SerializedName("in_reply_to_status_id_str")
@Expose
private Object inReplyToStatusIdStr;
@SerializedName("in_reply_to_user_id")
@Expose
private Object inReplyToUserId;
@SerializedName("in_reply_to_user_id_str")
@Expose
private Object inReplyToUserIdStr;
@SerializedName("in_reply_to_screen_name")
@Expose
private Object inReplyToScreenName;
@SerializedName("user")
@Expose
private User_ user;
@SerializedName("geo")
@Expose
private Object geo;
@SerializedName("coordinates")
@Expose
private Object coordinates;
@SerializedName("place")
@Expose
private Object place;
@SerializedName("contributors")
@Expose
private Object contributors;
@SerializedName("is_quote_status")
@Expose
private boolean isQuoteStatus;
@SerializedName("quote_count")
@Expose
private long quoteCount;
@SerializedName("reply_count")
@Expose
private long replyCount;
@SerializedName("retweet_count")
@Expose
private long retweetCount;
@SerializedName("favorite_count")
@Expose
private long favoriteCount;
@SerializedName("entities")
@Expose
private Entities entities;
@SerializedName("extended_entities")
@Expose
private ExtendedEntities extendedEntities;
@SerializedName("favorited")
@Expose
private boolean favorited;
@SerializedName("retweeted")
@Expose
private boolean retweeted;
@SerializedName("possibly_sensitive")
@Expose
private boolean possiblySensitive;
@SerializedName("filter_level")
@Expose
private String filterLevel;
@SerializedName("lang")
@Expose
private String lang;

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public long getId() {
return id;
}

public void setId(long id) {
this.id = id;
}

public String getIdStr() {
return idStr;
}

public void setIdStr(String idStr) {
this.idStr = idStr;
}

public String getText() {
return text;
}

public void setText(String text) {
this.text = text;
}

public List<Long> getDisplayTextRange() {
return displayTextRange;
}

public void setDisplayTextRange(List<Long> displayTextRange) {
this.displayTextRange = displayTextRange;
}

public String getSource() {
return source;
}

public void setSource(String source) {
this.source = source;
}

public boolean isTruncated() {
return truncated;
}

public void setTruncated(boolean truncated) {
this.truncated = truncated;
}

public Object getInReplyToStatusId() {
return inReplyToStatusId;
}

public void setInReplyToStatusId(Object inReplyToStatusId) {
this.inReplyToStatusId = inReplyToStatusId;
}

public Object getInReplyToStatusIdStr() {
return inReplyToStatusIdStr;
}

public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
this.inReplyToStatusIdStr = inReplyToStatusIdStr;
}

public Object getInReplyToUserId() {
return inReplyToUserId;
}

public void setInReplyToUserId(Object inReplyToUserId) {
this.inReplyToUserId = inReplyToUserId;
}

public Object getInReplyToUserIdStr() {
return inReplyToUserIdStr;
}

public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
this.inReplyToUserIdStr = inReplyToUserIdStr;
}

public Object getInReplyToScreenName() {
return inReplyToScreenName;
}

public void setInReplyToScreenName(Object inReplyToScreenName) {
this.inReplyToScreenName = inReplyToScreenName;
}

public User_ getUser() {
return user;
}

public void setUser(User_ user) {
this.user = user;
}

public Object getGeo() {
return geo;
}

public void setGeo(Object geo) {
this.geo = geo;
}

public Object getCoordinates() {
return coordinates;
}

public void setCoordinates(Object coordinates) {
this.coordinates = coordinates;
}

public Object getPlace() {
return place;
}

public void setPlace(Object place) {
this.place = place;
}

public Object getContributors() {
return contributors;
}

public void setContributors(Object contributors) {
this.contributors = contributors;
}

public boolean isIsQuoteStatus() {
return isQuoteStatus;
}

public void setIsQuoteStatus(boolean isQuoteStatus) {
this.isQuoteStatus = isQuoteStatus;
}

public long getQuoteCount() {
return quoteCount;
}

public void setQuoteCount(long quoteCount) {
this.quoteCount = quoteCount;
}

public long getReplyCount() {
return replyCount;
}

public void setReplyCount(long replyCount) {
this.replyCount = replyCount;
}

public long getRetweetCount() {
return retweetCount;
}

public void setRetweetCount(long retweetCount) {
this.retweetCount = retweetCount;
}

public long getFavoriteCount() {
return favoriteCount;
}

public void setFavoriteCount(long favoriteCount) {
this.favoriteCount = favoriteCount;
}

public Entities getEntities() {
return entities;
}

public void setEntities(Entities entities) {
this.entities = entities;
}

public ExtendedEntities getExtendedEntities() {
return extendedEntities;
}

public void setExtendedEntities(ExtendedEntities extendedEntities) {
this.extendedEntities = extendedEntities;
}

public boolean isFavorited() {
return favorited;
}

public void setFavorited(boolean favorited) {
this.favorited = favorited;
}

public boolean isRetweeted() {
return retweeted;
}

public void setRetweeted(boolean retweeted) {
this.retweeted = retweeted;
}

public boolean isPossiblySensitive() {
return possiblySensitive;
}

public void setPossiblySensitive(boolean possiblySensitive) {
this.possiblySensitive = possiblySensitive;
}

public String getFilterLevel() {
return filterLevel;
}

public void setFilterLevel(String filterLevel) {
this.filterLevel = filterLevel;
}

public String getLang() {
return lang;
}

public void setLang(String lang) {
this.lang = lang;
}

}