package fr.ch.aoc2022.day03;

import java.util.List;

public class Day03 {
    public int sumOfPriorities(List<String> input) {
        return input.stream()
                .map(this::parse)
              //  .peek(System.out::println)
                .map(Rucksack::getItemInBothCompartments)
               // .peek(System.out::println)
                .mapToInt(this::getPriority)
               // .peek(System.out::println)
                .sum();
    }

    private int getPriority(Character character) {
        int minuscule = character - 'a' + 1;
        if(minuscule > 0) {
            return minuscule;
        }
        return character - 'A' + 27;
    }

    private Rucksack parse(String line) {
        return new Rucksack(line.substring(0, line.length()/2), line.substring(line.length()/2));
    }
}
