package org.example.player;

public class MockPlayerInput extends BasePlayer {

    public MockPlayerInput(String firstName, String lastName, int rating) {
        super(firstName, lastName, rating);
    }

    @Override
    public String toString() {
        StringBuilder playerString = new StringBuilder();
        return playerString
                .append(this.getFirstName())
                .append(" ")
                .append(this.getLastName())
                .toString();
    }
}
