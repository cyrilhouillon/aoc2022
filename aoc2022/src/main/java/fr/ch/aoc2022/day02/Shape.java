package fr.ch.aoc2022.day02;

public enum Shape {

    ROCK(1), PAPER(2), SCISSORS(3);

    private final int innerScore;

    Shape(int innerScore) {
        this.innerScore = innerScore;
    }

    public int getInnerScore() {
        return innerScore;
    }

    public RoundResult against(Shape opponent) {
        if (this.equals(opponent)) {
            return RoundResult.DRAW;
        }
        if (this.ordinal() == ((opponent.ordinal() + 1) % 3)) {
            return RoundResult.VICTORY;
        }
        return RoundResult.DEFEAT;
    }
}
