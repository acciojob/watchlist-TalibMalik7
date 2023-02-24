package com.driver;

//Movie.java - String name, int durationInMinutes, double imdbRating, no-args constructor,
// all-args constructor and getters-setters
public class Movie {
    private String name;
    private int duratonInMinutes;
    private double imdbRating;
    public Movie(){}
    public Movie(String name , int dur, double rating){
        this.name = name;
        this.duratonInMinutes = dur;
        imdbRating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuratonInMinutes() {
        return duratonInMinutes;
    }

    public void setDuratonInMinutes(int duratonInMinutes) {
        this.duratonInMinutes = duratonInMinutes;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
