package fr.ch.aoc2022.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ElvesParser {
    public List<Elf> parse(List<String> input) {

        return input.stream().collect(
                        this::newListOfListOfString,
                        this::accumuleLine,
                        this::combinePartialLists).stream()
                .map(lines -> lines.stream().map(Long::valueOf).collect(toList()))
                .map(Elf::new)
                .collect(toList());
    }

    private ArrayList<List<String>> newListOfListOfString() {
        return new ArrayList<List<String>>(Arrays.asList(new ArrayList<>()));
    }

    private void accumuleLine(List<List<String>> list, String line) {
        if (line.isBlank()) {
            list.add(new ArrayList<>());
        } else {
            list.get(list.size() - 1).add(line);
        }
    }

    private void combinePartialLists(List<List<String>> list1, List<List<String>> list2) {
        list1.get(list1.size() - 1).addAll(list2.remove(0));
        list1.addAll(list2);
    }

}
