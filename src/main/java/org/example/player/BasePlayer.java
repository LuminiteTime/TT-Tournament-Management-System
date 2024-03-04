package org.example.player;

public class BasePlayer {
    protected String firstName;
    protected String lastName;
    protected int rating;

    public BasePlayer(String firstName, String lastName, int rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRating() {
        return rating;
    }

}
