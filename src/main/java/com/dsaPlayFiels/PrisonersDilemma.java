package com.dsaPlayFiels;

import java.util.Map;

public class PrisonersDilemma {
    private Game game;
    private int seriesLength = 5;
    private int goal = 35;
    private Player player1;
    private Player player2;


    public void setSeries() {
        this.game = new Game();
    }

    public PrisonersDilemma() {
        player1 = new Player();
        player2 = new Player();
    }

//    TODO : Split the functionality
//    TODO : Evaluate results functionality
//    TODO : Update after review
    public void playSeries() {
        for (int i = 0; i < seriesLength; i++) {
            game = new Game();
            Map<String, EachRoundScore> result =
                    game.runGame(player1.getPlayerId(), player2.getPlayerId(), i + 1);
            player1.updateCurrentMove(result.get(player1.getPlayerId()));
            player2.updateCurrentMove(result.get(player2.getPlayerId()));
            System.out.println(player1.getPlayerId() + " score: " + player1.getNetScore());
            System.out.println(player2.getPlayerId() + " score: " + player2.getNetScore() + "\n=====");
            if (player1.getNetScore() >= goal) {
                System.out.println(player1.getPlayerId() + " wins!");
                return;
            }
            if (player2.getNetScore() >= goal) {
                System.out.println(player2.getPlayerId() + " wins!");
                return;
            }
        }
        results();
    }

    private void results() {
        if (player1.getNetScore() > player2.getNetScore()) {
            System.out.println(player1.getPlayerId() + " wins!");
            return;
        }
        if (player2.getNetScore() > player1.getNetScore()) {
            System.out.println(player2.getPlayerId() + " wins!");
            return;
        }
        System.out.println("It's a draw!");
    }
}
