
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Published implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Published> CREATOR = new Creator<Published>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Published createFromParcel(android.os.Parcel in) {
            return new Published(in);
        }

        public Published[] newArray(int size) {
            return (new Published[size]);
        }

    }
    ;

    protected Published(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Published() {
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
