package fr.ch.aoc2022.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static fr.ch.aoc2022.day02.RoundResult.*;
import static fr.ch.aoc2022.day02.Shape.*;

public class Test2RoundParser implements RoundParser {

    private static final Map<String, Shape> shapeCodification = new HashMap<>() {{
        put("A", ROCK);
        put("B", PAPER);
        put("C", SCISSORS);

    }};
    private static final Map<String, RoundResult> resultCodification = new HashMap<>() {{
        put("X", DEFEAT);
        put("Y", DRAW);
        put("Z", VICTORY);
    }};


    @Override
    public Round parse(String line) {
        Shape opponent = shapeCodification.get(line.substring(0, 1));
        RoundResult result = resultCodification.get(line.substring(2, 3));
        Shape player = Stream.of(Shape.values()).filter(s -> result.equals(s.against(opponent))).findAny().get();
        return new Round(player, opponent, result);
    }
}
