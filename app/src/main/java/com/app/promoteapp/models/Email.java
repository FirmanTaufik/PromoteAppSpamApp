
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Email implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Email> CREATOR = new Creator<Email>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Email createFromParcel(android.os.Parcel in) {
            return new Email(in);
        }

        public Email[] newArray(int size) {
            return (new Email[size]);
        }

    }
    ;

    protected Email(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Email() {
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
