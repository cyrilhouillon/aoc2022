package fr.ch.aoc2022.day01;

import java.util.List;

public class Day01 {

    private final ElvesParser elvesParser;

    public Day01(ElvesParser elvesParser) {
        this.elvesParser = elvesParser;
    }

    public long maxCarriedCalories(List<String> input) {
        return elvesParser.parse(input).stream()
                .mapToLong(Elf::getCaloriesCarried)
                .max()
                .orElse(0l);
    }
}
