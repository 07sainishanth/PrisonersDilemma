package com.dsaPlayFiels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String firstName;
    private String lastName;
    private String playerId;
    private List<EachRoundScore> scores = new ArrayList<>();
    private int netScore = 0;

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void updateCurrentMove(EachRoundScore score) {
        scores.add(score);
        netScore += score.getScore();
    }

    public int getNetScore() {
        return netScore;
    }

    public Player() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        setFirstName(sc.nextLine());

        System.out.println("Please enter your last name: ");
        setLastName(sc.nextLine());

        System.out.println("Please enter your player id: ");
        setPlayerId(sc.nextLine());

        System.out.println("Hello " + getPlayerId() + "!");
        System.out.println("Welcome to the game. Please wait your turn to play");
        scores = new ArrayList<>();
    }
}
