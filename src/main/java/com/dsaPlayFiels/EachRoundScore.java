package com.dsaPlayFiels;

public class EachRoundScore {
    private int score = 0;
    private boolean coOperate = false;
    private int round = 0;
    private void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    private void setCoOperate(boolean coOperate) {
        this.coOperate = coOperate;
    }

    public boolean getCoOperate() {
        return coOperate;
    }

    private void setRound(int round) {
        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public void updateMove(int score, boolean coOperate) {
        setScore(score);
        setCoOperate(coOperate);
    }

    public EachRoundScore() {
    }

    public EachRoundScore(int round) {
        setRound(round);
    }

    public EachRoundScore(int score, boolean coOperate, int round) {
        setScore(score);
        setCoOperate(coOperate);
        setRound(round);
    }
}
