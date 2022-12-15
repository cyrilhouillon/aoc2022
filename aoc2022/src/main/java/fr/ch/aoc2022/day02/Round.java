package fr.ch.aoc2022.day02;

import java.util.stream.Stream;

public class Round {

    private final Shape opponent;
    private final Shape player;
    private final RoundResult result;

    public Round(String round) {
        opponent = Shape.forCode(round.substring(0, 1));
        result = RoundResult.forCode(round.substring(2, 3));
        player = Stream.of(Shape.values()).filter(s -> result.equals(s.against(opponent))).findAny().get();
    }

    public int getScore() {
        return player.getInnerScore() + result.getScore();
    }
}
