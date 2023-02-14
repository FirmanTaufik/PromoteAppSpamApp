
package com.app.promoteapp.models;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Entry implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Id__1 id;
    @SerializedName("published")
    @Expose
    private Published published;
    @SerializedName("updated")
    @Expose
    private Updated__1 updated;
    @SerializedName("title")
    @Expose
    private Title__1 title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("link")
    @Expose
    private List<Link__1> link = null;
    @SerializedName("author")
    @Expose
    private List<Author__1> author = null;
    @SerializedName("media$thumbnail")
    @Expose
    private Media$thumbnail media$thumbnail;
    @SerializedName("thr$total")
    @Expose
    private Thr$total thr$total;
    public final static Creator<Entry> CREATOR = new Creator<Entry>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Entry createFromParcel(android.os.Parcel in) {
            return new Entry(in);
        }

        public Entry[] newArray(int size) {
            return (new Entry[size]);
        }

    }
    ;

    protected Entry(android.os.Parcel in) {
        this.id = ((Id__1) in.readValue((Id__1.class.getClassLoader())));
        this.published = ((Published) in.readValue((Published.class.getClassLoader())));
        this.updated = ((Updated__1) in.readValue((Updated__1.class.getClassLoader())));
        this.title = ((Title__1) in.readValue((Title__1.class.getClassLoader())));
        this.content = ((Content) in.readValue((Content.class.getClassLoader())));
        in.readList(this.link, (Link__1.class.getClassLoader()));
        in.readList(this.author, (Author__1.class.getClassLoader()));
        this.media$thumbnail = ((Media$thumbnail) in.readValue((Media$thumbnail.class.getClassLoader())));
        this.thr$total = ((Thr$total) in.readValue((Thr$total.class.getClassLoader())));
    }

    public Entry() {
    }

    public Id__1 getId() {
        return id;
    }

    public void setId(Id__1 id) {
        this.id = id;
    }

    public Published getPublished() {
        return published;
    }

    public void setPublished(Published published) {
        this.published = published;
    }

    public Updated__1 getUpdated() {
        return updated;
    }

    public void setUpdated(Updated__1 updated) {
        this.updated = updated;
    }

    public Title__1 getTitle() {
        return title;
    }

    public void setTitle(Title__1 title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List<Link__1> getLink() {
        return link;
    }

    public void setLink(List<Link__1> link) {
        this.link = link;
    }

    public List<Author__1> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author__1> author) {
        this.author = author;
    }

    public Media$thumbnail getMedia$thumbnail() {
        return media$thumbnail;
    }

    public void setMedia$thumbnail(Media$thumbnail media$thumbnail) {
        this.media$thumbnail = media$thumbnail;
    }

    public Thr$total getThr$total() {
        return thr$total;
    }

    public void setThr$total(Thr$total thr$total) {
        this.thr$total = thr$total;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(published);
        dest.writeValue(updated);
        dest.writeValue(title);
        dest.writeValue(content);
        dest.writeList(link);
        dest.writeList(author);
        dest.writeValue(media$thumbnail);
        dest.writeValue(thr$total);
    }

    public int describeContents() {
        return  0;
    }

}
