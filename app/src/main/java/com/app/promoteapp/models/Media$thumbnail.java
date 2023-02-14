
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Media$thumbnail implements Parcelable
{

    @SerializedName("xmlns$media")
    @Expose
    private String xmlns$media;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("width")
    @Expose
    private String width;
    public final static Creator<Media$thumbnail> CREATOR = new Creator<Media$thumbnail>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Media$thumbnail createFromParcel(android.os.Parcel in) {
            return new Media$thumbnail(in);
        }

        public Media$thumbnail[] newArray(int size) {
            return (new Media$thumbnail[size]);
        }

    }
    ;

    protected Media$thumbnail(android.os.Parcel in) {
        this.xmlns$media = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Media$thumbnail() {
    }

    public String getXmlns$media() {
        return xmlns$media;
    }

    public void setXmlns$media(String xmlns$media) {
        this.xmlns$media = xmlns$media;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(xmlns$media);
        dest.writeValue(url);
        dest.writeValue(height);
        dest.writeValue(width);
    }

    public int describeContents() {
        return  0;
    }

}
