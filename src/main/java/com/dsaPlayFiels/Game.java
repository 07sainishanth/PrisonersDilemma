package com.dsaPlayFiels;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private int noOfPlayers = 2;
    private int coOperatePoints = 5;
    private int minNoCoOperatePoints = 0;
    private int maxNoOperatePoints = 10;
    private String player1, player2;
    private boolean player1CoOperate = false, player2CoOperate = false;
    private int round;

    private void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    private void setCoOperatePoints(int coOperatePoints) {
        this.coOperatePoints = coOperatePoints;
    }

    private void setMinNoCoOperatePoints(int minNoCoOperatePoints) {
        this.minNoCoOperatePoints = minNoCoOperatePoints;
    }

    private void setMaxNoOperatePoints(int maxNoOperatePoints) {
        this.maxNoOperatePoints = maxNoOperatePoints;
    }

    private Map<String, EachRoundScore> evaluatePoints() {
        Map<String, EachRoundScore> map = new HashMap<>();
        if (player1CoOperate && player2CoOperate) {
            map.put(player1, new EachRoundScore(minNoCoOperatePoints, player1CoOperate, round));
            map.put(player2, new EachRoundScore(minNoCoOperatePoints, player2CoOperate, round));
        }
        else if (!player1CoOperate && !player2CoOperate) {
            map.put(player1, new EachRoundScore(minNoCoOperatePoints, player1CoOperate, round));
            map.put(player2, new EachRoundScore(minNoCoOperatePoints, player2CoOperate, round));
        }
        else if (player1CoOperate && !player2CoOperate) {
            map.put(player1, new EachRoundScore(maxNoOperatePoints, player1CoOperate, round));
            map.put(player2, new EachRoundScore(minNoCoOperatePoints, player2CoOperate, round));
        }
        else if (player2CoOperate && !player1CoOperate) {
            map.put(player1, new EachRoundScore(minNoCoOperatePoints, player1CoOperate, round));
            map.put(player2, new EachRoundScore(maxNoOperatePoints, player2CoOperate, round));
        }
        return map;
    }


    public Map<String, EachRoundScore> runGame(String player1, String player2, int round) {
        this.player1 = player1;
        this.player2 = player2;
        this.round = round;
        System.out.print(player1 + " please choose 1 to Co-operate and 2 to not: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) this.player1CoOperate = true;
        System.out.print(player2 + " please choose 1 to Co-operate and 2 to not: ");
        scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) this.player2CoOperate = true;
        return evaluatePoints();
    }


    public Game() {
    }
}
