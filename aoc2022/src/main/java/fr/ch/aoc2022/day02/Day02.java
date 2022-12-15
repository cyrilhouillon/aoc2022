package fr.ch.aoc2022.day02;

import java.util.List;

public class Day02 {
    public int computeScore(List<String> input) {
        return input.stream()
                .map(Round::new)
                .mapToInt(Round::getScore)
                .sum();
    }
}
