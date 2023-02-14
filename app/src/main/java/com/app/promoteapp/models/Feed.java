
package com.app.promoteapp.models;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Feed implements Parcelable
{

    @SerializedName("xmlns")
    @Expose
    private String xmlns;
    @SerializedName("xmlns$openSearch")
    @Expose
    private String xmlns$openSearch;
    @SerializedName("xmlns$blogger")
    @Expose
    private String xmlns$blogger;
    @SerializedName("xmlns$georss")
    @Expose
    private String xmlns$georss;
    @SerializedName("xmlns$gd")
    @Expose
    private String xmlns$gd;
    @SerializedName("xmlns$thr")
    @Expose
    private String xmlns$thr;
    @SerializedName("id")
    @Expose
    private Id id;
    @SerializedName("updated")
    @Expose
    private Updated updated;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("subtitle")
    @Expose
    private Subtitle subtitle;
    @SerializedName("link")
    @Expose
    private List<Link> link = null;
    @SerializedName("author")
    @Expose
    private List<Author> author = null;
    @SerializedName("generator")
    @Expose
    private Generator generator;
    @SerializedName("openSearch$totalResults")
    @Expose
    private OpenSearch$totalResults openSearch$totalResults;
    @SerializedName("openSearch$startIndex")
    @Expose
    private OpenSearch$startIndex openSearch$startIndex;
    @SerializedName("openSearch$itemsPerPage")
    @Expose
    private OpenSearch$itemsPerPage openSearch$itemsPerPage;
    @SerializedName("entry")
    @Expose
    private List<Entry> entry = null;
    public final static Creator<Feed> CREATOR = new Creator<Feed>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Feed createFromParcel(android.os.Parcel in) {
            return new Feed(in);
        }

        public Feed[] newArray(int size) {
            return (new Feed[size]);
        }

    }
    ;

    protected Feed(android.os.Parcel in) {
        this.xmlns = ((String) in.readValue((String.class.getClassLoader())));
        this.xmlns$openSearch = ((String) in.readValue((String.class.getClassLoader())));
        this.xmlns$blogger = ((String) in.readValue((String.class.getClassLoader())));
        this.xmlns$georss = ((String) in.readValue((String.class.getClassLoader())));
        this.xmlns$gd = ((String) in.readValue((String.class.getClassLoader())));
        this.xmlns$thr = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Id) in.readValue((Id.class.getClassLoader())));
        this.updated = ((Updated) in.readValue((Updated.class.getClassLoader())));
        this.title = ((Title) in.readValue((Title.class.getClassLoader())));
        this.subtitle = ((Subtitle) in.readValue((Subtitle.class.getClassLoader())));
        in.readList(this.link, (Link.class.getClassLoader()));
        in.readList(this.author, (Author.class.getClassLoader()));
        this.generator = ((Generator) in.readValue((Generator.class.getClassLoader())));
        this.openSearch$totalResults = ((OpenSearch$totalResults) in.readValue((OpenSearch$totalResults.class.getClassLoader())));
        this.openSearch$startIndex = ((OpenSearch$startIndex) in.readValue((OpenSearch$startIndex.class.getClassLoader())));
        this.openSearch$itemsPerPage = ((OpenSearch$itemsPerPage) in.readValue((OpenSearch$itemsPerPage.class.getClassLoader())));
        in.readList(this.entry, (Entry.class.getClassLoader()));
    }

    public Feed() {
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getXmlns$openSearch() {
        return xmlns$openSearch;
    }

    public void setXmlns$openSearch(String xmlns$openSearch) {
        this.xmlns$openSearch = xmlns$openSearch;
    }

    public String getXmlns$blogger() {
        return xmlns$blogger;
    }

    public void setXmlns$blogger(String xmlns$blogger) {
        this.xmlns$blogger = xmlns$blogger;
    }

    public String getXmlns$georss() {
        return xmlns$georss;
    }

    public void setXmlns$georss(String xmlns$georss) {
        this.xmlns$georss = xmlns$georss;
    }

    public String getXmlns$gd() {
        return xmlns$gd;
    }

    public void setXmlns$gd(String xmlns$gd) {
        this.xmlns$gd = xmlns$gd;
    }

    public String getXmlns$thr() {
        return xmlns$thr;
    }

    public void setXmlns$thr(String xmlns$thr) {
        this.xmlns$thr = xmlns$thr;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Updated getUpdated() {
        return updated;
    }

    public void setUpdated(Updated updated) {
        this.updated = updated;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> link) {
        this.link = link;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public OpenSearch$totalResults getOpenSearch$totalResults() {
        return openSearch$totalResults;
    }

    public void setOpenSearch$totalResults(OpenSearch$totalResults openSearch$totalResults) {
        this.openSearch$totalResults = openSearch$totalResults;
    }

    public OpenSearch$startIndex getOpenSearch$startIndex() {
        return openSearch$startIndex;
    }

    public void setOpenSearch$startIndex(OpenSearch$startIndex openSearch$startIndex) {
        this.openSearch$startIndex = openSearch$startIndex;
    }

    public OpenSearch$itemsPerPage getOpenSearch$itemsPerPage() {
        return openSearch$itemsPerPage;
    }

    public void setOpenSearch$itemsPerPage(OpenSearch$itemsPerPage openSearch$itemsPerPage) {
        this.openSearch$itemsPerPage = openSearch$itemsPerPage;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(xmlns);
        dest.writeValue(xmlns$openSearch);
        dest.writeValue(xmlns$blogger);
        dest.writeValue(xmlns$georss);
        dest.writeValue(xmlns$gd);
        dest.writeValue(xmlns$thr);
        dest.writeValue(id);
        dest.writeValue(updated);
        dest.writeValue(title);
        dest.writeValue(subtitle);
        dest.writeList(link);
        dest.writeList(author);
        dest.writeValue(generator);
        dest.writeValue(openSearch$totalResults);
        dest.writeValue(openSearch$startIndex);
        dest.writeValue(openSearch$itemsPerPage);
        dest.writeList(entry);
    }

    public int describeContents() {
        return  0;
    }

}
