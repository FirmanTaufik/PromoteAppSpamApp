
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Author__1 implements Parcelable
{

    @SerializedName("name")
    @Expose
    private Name__1 name;
    @SerializedName("uri")
    @Expose
    private Uri__1 uri;
    @SerializedName("email")
    @Expose
    private Email__1 email;
    @SerializedName("gd$image")
    @Expose
    private Gd$image__1 gd$image;
    public final static Creator<Author__1> CREATOR = new Creator<Author__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Author__1 createFromParcel(android.os.Parcel in) {
            return new Author__1(in);
        }

        public Author__1 [] newArray(int size) {
            return (new Author__1[size]);
        }

    }
    ;

    protected Author__1(android.os.Parcel in) {
        this.name = ((Name__1) in.readValue((Name__1.class.getClassLoader())));
        this.uri = ((Uri__1) in.readValue((Uri__1.class.getClassLoader())));
        this.email = ((Email__1) in.readValue((Email__1.class.getClassLoader())));
        this.gd$image = ((Gd$image__1) in.readValue((Gd$image__1.class.getClassLoader())));
    }

    public Author__1() {
    }

    public Name__1 getName() {
        return name;
    }

    public void setName(Name__1 name) {
        this.name = name;
    }

    public Uri__1 getUri() {
        return uri;
    }

    public void setUri(Uri__1 uri) {
        this.uri = uri;
    }

    public Email__1 getEmail() {
        return email;
    }

    public void setEmail(Email__1 email) {
        this.email = email;
    }

    public Gd$image__1 getGd$image() {
        return gd$image;
    }

    public void setGd$image(Gd$image__1 gd$image) {
        this.gd$image = gd$image;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(uri);
        dest.writeValue(email);
        dest.writeValue(gd$image);
    }

    public int describeContents() {
        return  0;
    }

}
