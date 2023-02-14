
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class OpenSearch$startIndex implements Parcelable
{

    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<OpenSearch$startIndex> CREATOR = new Creator<OpenSearch$startIndex>() {


        @SuppressWarnings({
            "unchecked"
        })
        public OpenSearch$startIndex createFromParcel(android.os.Parcel in) {
            return new OpenSearch$startIndex(in);
        }

        public OpenSearch$startIndex[] newArray(int size) {
            return (new OpenSearch$startIndex[size]);
        }

    }
    ;

    protected OpenSearch$startIndex(android.os.Parcel in) {
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public OpenSearch$startIndex() {
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
