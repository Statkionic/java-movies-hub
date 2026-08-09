package ru.practicum.moviehub.model;

public class Movie {
    private int year;
    private String title;

    public Movie(String title, int year) {
        this.year = year;
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Post{" +
                "year=" + year +
                ", title='" + title +
                '}';
    }
}