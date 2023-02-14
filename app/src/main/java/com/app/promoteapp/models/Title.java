
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Title implements Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Title> CREATOR = new Creator<Title>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Title createFromParcel(android.os.Parcel in) {
            return new Title(in);
        }

        public Title[] newArray(int size) {
            return (new Title[size]);
        }

    }
    ;

    protected Title(android.os.Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Title() {
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
