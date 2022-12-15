package fr.ch.aoc2022.day02;

public enum RoundResult {

    DEFEAT(0), DRAW(3), VICTORY(6);

    private final int score;

    RoundResult(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
