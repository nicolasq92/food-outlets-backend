package com.project.springbootrestfoodoutlets;

public class City {
    private int id;
    private String city;
    private String name;
    private int estimated_cost;
    private UserRating user_rating;

    public City(int id, String city, String name, int estimated_cost, UserRating user_rating) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.estimated_cost = estimated_cost;
        this.user_rating = user_rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstimated_cost() {
        return estimated_cost;
    }

    public void setEstimated_cost(int estimated_cost) {
        this.estimated_cost = estimated_cost;
    }

    public UserRating getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(UserRating user_rating) {
        this.user_rating = user_rating;
    }
}
