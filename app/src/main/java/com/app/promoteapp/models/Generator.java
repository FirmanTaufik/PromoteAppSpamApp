
package com.app.promoteapp.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Generator implements Parcelable
{

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("$t")
    @Expose
    private String $t;
    public final static Creator<Generator> CREATOR = new Creator<Generator>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Generator createFromParcel(android.os.Parcel in) {
            return new Generator(in);
        }

        public Generator[] newArray(int size) {
            return (new Generator[size]);
        }

    }
    ;

    protected Generator(android.os.Parcel in) {
        this.version = ((String) in.readValue((String.class.getClassLoader())));
        this.uri = ((String) in.readValue((String.class.getClassLoader())));
        this.$t = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Generator() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String get$t() {
        return $t;
    }

    public void set$t(String $t) {
        this.$t = $t;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(version);
        dest.writeValue(uri);
        dest.writeValue($t);
    }

    public int describeContents() {
        return  0;
    }

}
