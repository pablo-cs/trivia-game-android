package edu.vassar.cmpu203.triviagame.model;

public class Player {
    String name;
    int wins = 0;
    int answerStreak = 0;
    int questionNumber = answerStreak + 1;

    public Player(String name) {
        this.name = name;
    }

    public Player() {
        this.name = "Player 1";
    }

    public void rightAns(){
        answerStreak++;
    }
    public void resetStreak(){
        answerStreak = 0;
    }

}