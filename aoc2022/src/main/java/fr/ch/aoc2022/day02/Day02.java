package fr.ch.aoc2022.day02;

import java.util.List;

public class Day02 {

    private final RoundParser roundParser;

    public Day02(RoundParser roundParser) {
        this.roundParser = roundParser;
    }

    public int computeScore(List<String> input) {
        return input.stream()
                .map(roundParser)
                .mapToInt(Round::getScore)
                .sum();
    }




}
