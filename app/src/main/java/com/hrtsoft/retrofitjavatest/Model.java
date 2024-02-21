package com.hrtsoft.retrofitjavatest;

import com.google.gson.annotations.SerializedName;

public class Model {
    @SerializedName("name")
    private String title;

    @SerializedName("realname")
    private String description;

    @SerializedName("imageurl")
    private String thumbnail;

    @SerializedName("team")
    private String team;

    @SerializedName("createdby")
    private String  createdby;


    public Model(String title, String description, String thumbnail, String team, String createdby) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.team = team;
        this.createdby = createdby;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
}
