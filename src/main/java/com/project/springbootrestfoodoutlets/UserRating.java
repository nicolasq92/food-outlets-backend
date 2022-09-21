package com.project.springbootrestfoodoutlets;

public class UserRating {
    private Double average_rating;
    private int votes;

    public UserRating(Double average_rating, int votes) {
        this.average_rating = average_rating;
        this.votes = votes;
    }

    public Double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(Double average_rating) {
        this.average_rating = average_rating;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
