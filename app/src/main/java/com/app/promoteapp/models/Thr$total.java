
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Thr$total implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Thr$total> CREATOR = new Creator<Thr$total>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Thr$total createFromParcel(android.os.Parcel in) {
            return new Thr$total(in);
        }

        public Thr$total[] newArray(int size) {
            return (new Thr$total[size]);
        }

    }
    ;

    protected Thr$total(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Thr$total() {
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
