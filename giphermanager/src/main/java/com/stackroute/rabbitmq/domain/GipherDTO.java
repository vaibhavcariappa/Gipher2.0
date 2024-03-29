package com.stackroute.rabbitmq.domain;

public class GipherDTO {

    private String gifId;
    private String gifName;
    private String gifUrl;
    private String source;
    private String rating;
    private String comments;
    private ImageDTO image;

    public GipherDTO() {
    }

    public GipherDTO(String gifId, String gifName, String gifUrl, String source, String rating, String comments, ImageDTO image) {
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

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }
}
