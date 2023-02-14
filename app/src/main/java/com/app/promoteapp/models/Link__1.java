
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Link__1 implements Parcelable
{

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("title")
    @Expose
    private String title;
    public final static Creator<Link__1> CREATOR = new Creator<Link__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Link__1 createFromParcel(android.os.Parcel in) {
            return new Link__1(in);
        }

        public Link__1 [] newArray(int size) {
            return (new Link__1[size]);
        }

    }
    ;

    protected Link__1(android.os.Parcel in) {
        this.rel = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Link__1() {
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(rel);
        dest.writeValue(type);
        dest.writeValue(href);
        dest.writeValue(title);
    }

    public int describeContents() {
        return  0;
    }

}
