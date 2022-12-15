package fr.ch.aoc2022.day02;

import java.util.HashMap;
import java.util.Map;

import static fr.ch.aoc2022.day02.Shape.*;

public class Test1RoundParser implements RoundParser {

    private static final Map<String, Shape> codification = new HashMap<>() {{
        put("A", ROCK);
        put("B", PAPER);
        put("C", SCISSORS);
        put("X", ROCK);
        put("Y", PAPER);
        put("Z", SCISSORS);
    }};


    @Override
    public Round parse(String line) {
        Shape opponent = codification.get(line.substring(0, 1));
        Shape player = codification.get(line.substring(2, 3));
        RoundResult result = player.against(opponent);
        return new Round(player, opponent, result);
    }
}
