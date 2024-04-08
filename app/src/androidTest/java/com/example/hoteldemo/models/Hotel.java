package com.example.hoteldemo.models;

public class Hotel {
    private String hotelName;
    private String location;
    private int starRating;
    private String image;

    public Hotel(String hotelName, String location, int starRating, String image) {
        this.hotelName = hotelName;
        this.location = location;
        this.starRating = starRating;
        this.image = image;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}