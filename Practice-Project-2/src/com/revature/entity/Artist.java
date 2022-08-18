package com.revature.entity;

public class Artist {

    //member variables
    private int id;
    private String name;
    private String genre;

    //no-args constructor
    public Artist() {

    }

    //fully parameterized constructor
    public Artist(int id,String name,String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    //constructor without the id variable
    public Artist(String name,String genre){
        this.name = name;
        this.genre = genre;
    }

    //getters and setters for member variables
    public int getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //overridden toString method
    @Override
    public String toString() {
        return "{Artist ID: " + id + " / Artist Name: " + name + " / Artist genre: " + genre + "}";
    }
}
