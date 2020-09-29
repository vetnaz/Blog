package com.first_site.spring_site.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title , anons, full_text;
    private int views;

    public Long getId() {
        return id;
    }

    public Post() {
    }

    public Post(String title, String anons, String full_text) {
        this.title=title;
        this.anons=anons;
        this.full_text=full_text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return title;
    }

    public void setTittle(String tittle) {
        this.title = tittle;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
