
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Gd$image implements Parcelable
{

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("src")
    @Expose
    private String src;
    public final static Creator<Gd$image> CREATOR = new Creator<Gd$image>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Gd$image createFromParcel(android.os.Parcel in) {
            return new Gd$image(in);
        }

        public Gd$image[] newArray(int size) {
            return (new Gd$image[size]);
        }

    }
    ;

    protected Gd$image(android.os.Parcel in) {
        this.rel = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
        this.src = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Gd$image() {
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(rel);
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(src);
    }

    public int describeContents() {
        return  0;
    }

}
