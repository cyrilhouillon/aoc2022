package fr.ch.aoc2022.day02;

import java.util.HashMap;
import java.util.Map;

public enum RoundResult {

    DEFEAT(0), DRAW(3), VICTORY(6);

    private final int score;
    private static final Map<String, RoundResult> codification = new HashMap<>() {{
        put("X", DEFEAT);
        put("Y", DRAW);
        put("Z", VICTORY);
    }};

    RoundResult(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public static RoundResult forCode(String code) {
        return codification.get(code);
    }

}
