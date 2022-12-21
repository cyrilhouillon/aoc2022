package fr.ch.aoc2022.day03;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

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

    public int sumOfBadgesPriorities(List<String> input) {
        return groupBy3(input)
                .map(this::parse)
                //  .peek(System.out::println)
                .map(group -> Rucksack.findBadge(group.get(0), group.get(1), group.get(2)) )
                // .peek(System.out::println)
                .mapToInt(this::getPriority)
                // .peek(System.out::println)
                .sum();
    }

    private Stream<List<String>> groupBy3(List<String> input) {
        return IntStream.range(0, input.size())
                .filter(i -> i % 3 == 0)
                .mapToObj(i -> input.subList(i, Math.min(i + 3, input.size())));
    }


    private int getPriority(Character character) {
        int minuscule = character - 'a' + 1;
        if(minuscule > 0) {
            return minuscule;
        }
        return character - 'A' + 27;
    }

    private List<Rucksack> parse(List<String> group) {
        return group.stream()
                .map(this::parse)
                .collect(toList());
    }

    private Rucksack parse(String line) {
        return new Rucksack(line.substring(0, line.length()/2), line.substring(line.length()/2));
    }
}
