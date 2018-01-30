package com.twitterstreaming.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Medium____ {

@SerializedName("id")
@Expose
private long id;
@SerializedName("id_str")
@Expose
private String idStr;
@SerializedName("indices")
@Expose
private List<Long> indices = null;
@SerializedName("media_url")
@Expose
private String mediaUrl;
@SerializedName("media_url_https")
@Expose
private String mediaUrlHttps;
@SerializedName("url")
@Expose
private String url;
@SerializedName("display_url")
@Expose
private String displayUrl;
@SerializedName("expanded_url")
@Expose
private String expandedUrl;
@SerializedName("type")
@Expose
private String type;
@SerializedName("sizes")
@Expose
private Sizes__ sizes;
@SerializedName("source_status_id")
@Expose
private long sourceStatusId;
@SerializedName("source_status_id_str")
@Expose
private String sourceStatusIdStr;
@SerializedName("source_user_id")
@Expose
private long sourceUserId;
@SerializedName("source_user_id_str")
@Expose
private String sourceUserIdStr;

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

public List<Long> getIndices() {
return indices;
}

public void setIndices(List<Long> indices) {
this.indices = indices;
}

public String getMediaUrl() {
return mediaUrl;
}

public void setMediaUrl(String mediaUrl) {
this.mediaUrl = mediaUrl;
}

public String getMediaUrlHttps() {
return mediaUrlHttps;
}

public void setMediaUrlHttps(String mediaUrlHttps) {
this.mediaUrlHttps = mediaUrlHttps;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getDisplayUrl() {
return displayUrl;
}

public void setDisplayUrl(String displayUrl) {
this.displayUrl = displayUrl;
}

public String getExpandedUrl() {
return expandedUrl;
}

public void setExpandedUrl(String expandedUrl) {
this.expandedUrl = expandedUrl;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public Sizes__ getSizes() {
return sizes;
}

public void setSizes(Sizes__ sizes) {
this.sizes = sizes;
}

public long getSourceStatusId() {
return sourceStatusId;
}

public void setSourceStatusId(long sourceStatusId) {
this.sourceStatusId = sourceStatusId;
}

public String getSourceStatusIdStr() {
return sourceStatusIdStr;
}

public void setSourceStatusIdStr(String sourceStatusIdStr) {
this.sourceStatusIdStr = sourceStatusIdStr;
}

public long getSourceUserId() {
return sourceUserId;
}

public void setSourceUserId(long sourceUserId) {
this.sourceUserId = sourceUserId;
}

public String getSourceUserIdStr() {
return sourceUserIdStr;
}

public void setSourceUserIdStr(String sourceUserIdStr) {
this.sourceUserIdStr = sourceUserIdStr;
}

}