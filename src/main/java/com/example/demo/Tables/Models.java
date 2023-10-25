package com.example.demo.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Models")
public class Models {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "uuid")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private int category;
    @Column(name = "imaggeUrl")
    private String imaggeUrl;
    @Column(name = "startYear")
    private int startYear;
    @Column(name = "endYear")
    private int endYear;

    @Column(name = "modified")
    private int modified;
    @Column(name = "brand_id")
    private int brand_id;

    private String modelsName;

    //Геттеры и сеттеры


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getImaggeUrl() {
        return imaggeUrl;
    }

    public void setImaggeUrl(String imaggeUrl) {
        this.imaggeUrl = imaggeUrl;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getModified() {
        return modified;
    }

    public void setModified(int modified) {
        this.modified = modified;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public Models() {}
}
/*
* Successfully created project 'Web_1' on GitHub,
* but initial commit failed: Author identity unknown ***
* Please tell me who you are. Run git config --global user.email "you@example.com"
* git config --global user.name "Your Name" to set your account's default identity.
* Omit --global to set the identity only in this repository. empty ident name (for  ) not allowed
* */