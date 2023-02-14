
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Author implements Parcelable
{

    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("uri")
    @Expose
    private Uri uri;
    @SerializedName("email")
    @Expose
    private Email email;
    @SerializedName("gd$image")
    @Expose
    private Gd$image gd$image;
    public final static Creator<Author> CREATOR = new Creator<Author>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Author createFromParcel(android.os.Parcel in) {
            return new Author(in);
        }

        public Author[] newArray(int size) {
            return (new Author[size]);
        }

    }
    ;

    protected Author(android.os.Parcel in) {
        this.name = ((Name) in.readValue((Name.class.getClassLoader())));
        this.uri = ((Uri) in.readValue((Uri.class.getClassLoader())));
        this.email = ((Email) in.readValue((Email.class.getClassLoader())));
        this.gd$image = ((Gd$image) in.readValue((Gd$image.class.getClassLoader())));
    }

    public Author() {
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Gd$image getGd$image() {
        return gd$image;
    }

    public void setGd$image(Gd$image gd$image) {
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
