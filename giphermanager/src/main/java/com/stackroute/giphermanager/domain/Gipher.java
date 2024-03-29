package com.stackroute.giphermanager.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Gipher {

    @Id
    @JsonProperty("id")
    private String gifId;

    @JsonProperty("title")
    private String gifName;

    @JsonProperty("url")
    private String gifUrl;

    @JsonProperty("source")
    private String source;

    @JsonProperty("rating")
    private String rating;

    private String comments;

    private Image image;

    public Gipher() {
    }

    public Gipher(String gifId, String gifName, String gifUrl, String source, String rating, String comments, Image image) {
        this.gifId = gifId;
        this.gifName = gifName;
        this.gifUrl = gifUrl;
        this.source = source;
        this.rating = rating;
        this.comments = comments;
        this.image = image;
    }

    public String getGifId() {
        return gifId;
    }

    public void setGifId(String gifId) {
        this.gifId = gifId;
    }

    public String getGifName() {
        return gifName;
    }

    public void setGifName(String gifName) {
        this.gifName = gifName;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Gipher{" +
                "gifId='" + gifId + '\'' +
                ", gifName='" + gifName + '\'' +
                ", gifUrl='" + gifUrl + '\'' +
                ", source='" + source + '\'' +
                ", rating='" + rating + '\'' +
                ", comments='" + comments + '\'' +
                ", image=" + image +
                '}';
    }

}
