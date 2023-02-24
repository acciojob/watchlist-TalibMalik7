package com.driver;

//Movie.java - String name, int durationInMinutes, double imdbRating, no-args constructor,
// all-args constructor and getters-setters
public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRating;
    public Movie(){}
    public Movie(String name , int dur, double rating){
        this.name = name;
        this.durationInMinutes = dur;
        imdbRating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
