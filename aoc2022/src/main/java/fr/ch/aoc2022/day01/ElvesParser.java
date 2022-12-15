package fr.ch.aoc2022.day01;

import java.util.ArrayList;
import java.util.List;

public class ElvesParser {
    public List<Elf> parse(List<String> input) {

        List<Elf> elves = new ArrayList<>();

        List<Long> currentSupplies = new ArrayList<>();
        for (String line: input) {
            if(line.isBlank()){
                elves.add(new Elf(currentSupplies));
                currentSupplies = new ArrayList<>();
            } else {
                currentSupplies.add(Long.valueOf(line));
            }
        }
        if(!currentSupplies.isEmpty()) {
            elves.add(new Elf(currentSupplies));
        }
        return elves;
    }


}
