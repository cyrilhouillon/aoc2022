package fr.ch.aoc2022.day01;

import java.util.Comparator;
import java.util.List;

public class Day01 {

    private final ElvesParser elvesParser;

    public Day01(ElvesParser elvesParser) {
        this.elvesParser = elvesParser;
    }

    public long maxCarriedCalories(List<String> input) {
        return maxCarriedCalories(1, input);
    }

    public long maxCarriedCalories(int nbOfElves, List<String> input) {
        return elvesParser.parse(input).stream()
                .mapToLong(Elf::getCaloriesCarried)
                .boxed()
                .sorted(Comparator.comparingLong(Long::longValue).reversed())
                .limit(nbOfElves)
                .mapToLong(Long::longValue)
                .sum();
    }
}
