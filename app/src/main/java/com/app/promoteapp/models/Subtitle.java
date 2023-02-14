
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Subtitle implements Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Subtitle> CREATOR = new Creator<Subtitle>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Subtitle createFromParcel(android.os.Parcel in) {
            return new Subtitle(in);
        }

        public Subtitle[] newArray(int size) {
            return (new Subtitle[size]);
        }

    }
    ;

    protected Subtitle(android.os.Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Subtitle() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String get$t() {
        return $t;
    }

    public void set$t(String $t) {
        this.$t = $t;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue($t);
    }

    public int describeContents() {
        return  0;
    }

}
