
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Link implements Parcelable
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
    public final static Creator<Link> CREATOR = new Creator<Link>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Link createFromParcel(android.os.Parcel in) {
            return new Link(in);
        }

        public Link[] newArray(int size) {
            return (new Link[size]);
        }

    }
    ;

    protected Link(android.os.Parcel in) {
        this.rel = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Link() {
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

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(rel);
        dest.writeValue(type);
        dest.writeValue(href);
    }

    public int describeContents() {
        return  0;
    }

}
