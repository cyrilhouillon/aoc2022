package fr.ch.aoc2022.day02;

import java.util.HashMap;
import java.util.Map;

public enum Shape {

    ROCK(1), PAPER(2), SCISSORS(3);

    private static final Map<String, Shape> codification = new HashMap<>() {{
        put("A", ROCK);
        put("B", PAPER);
        put("C", SCISSORS);
        put("X", ROCK);
        put("Y", PAPER);
        put("Z", SCISSORS);
    }};
    private final int innerScore;

    Shape(int innerScore) {
        this.innerScore = innerScore;
    }

    public static Shape forCode(String code) {
        return codification.get(code);
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
