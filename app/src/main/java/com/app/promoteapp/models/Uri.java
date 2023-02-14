
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Uri implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Uri> CREATOR = new Creator<Uri>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Uri createFromParcel(android.os.Parcel in) {
            return new Uri(in);
        }

        public Uri[] newArray(int size) {
            return (new Uri[size]);
        }

    }
    ;

    protected Uri(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Uri() {
    }

    public String get$t() {
        return $t;
    }

    public void set$t(String $t) {
        this.$t = $t;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue($t);
    }

    public int describeContents() {
        return  0;
    }

}
