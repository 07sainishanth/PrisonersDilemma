package com.dsaPlayFiels.model;

public class Player {
    private String firstName;
    private String lastName;
    private String playerId;

    public Player(String firstName, String lastName, String playerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
