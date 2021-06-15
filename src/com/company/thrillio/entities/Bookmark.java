package com.company.thrillio.entities;

public class Bookmark {
    private long id;
    private String title;
    private String profileUrl;
    @Override
    public String toString() {
        return "Bookmark{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                '}';
    }

    public long getId(){
        return id;
    }
    public void setId(long  id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getProfileUrl(){
        return profileUrl;
    }
    public void setProfileUrl(String profileUrl){
        this.profileUrl=profileUrl;
    }
}

