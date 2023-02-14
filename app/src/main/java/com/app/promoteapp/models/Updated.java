
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Updated implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Updated> CREATOR = new Creator<Updated>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Updated createFromParcel(android.os.Parcel in) {
            return new Updated(in);
        }

        public Updated[] newArray(int size) {
            return (new Updated[size]);
        }

    }
    ;

    protected Updated(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Updated() {
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
