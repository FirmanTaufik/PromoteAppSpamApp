
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Uri__1 implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Uri__1> CREATOR = new Creator<Uri__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Uri__1 createFromParcel(android.os.Parcel in) {
            return new Uri__1(in);
        }

        public Uri__1 [] newArray(int size) {
            return (new Uri__1[size]);
        }

    }
    ;

    protected Uri__1(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Uri__1() {
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
