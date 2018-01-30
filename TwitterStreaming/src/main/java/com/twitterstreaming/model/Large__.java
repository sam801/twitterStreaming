package com.twitterstreaming.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Large__ {

@SerializedName("w")
@Expose
private long w;
@SerializedName("h")
@Expose
private long h;
@SerializedName("resize")
@Expose
private String resize;

public long getW() {
return w;
}

public void setW(long w) {
this.w = w;
}

public long getH() {
return h;
}

public void setH(long h) {
this.h = h;
}

public String getResize() {
return resize;
}

public void setResize(String resize) {
this.resize = resize;
}

}