package fr.ch.aoc2022.day03;

import java.util.*;
import java.util.stream.Stream;

public class Rucksack {
    private final Set<Character> compartment1 = new HashSet<>();
    private final Set<Character>  compartment2 = new HashSet<>();

    public Rucksack(String compartment1, String compartment2) {
        for(char c : compartment1.toCharArray()) {
            this.compartment1.add(c);
        }
        for(char c : compartment2.toCharArray()) {
            this.compartment2.add(c);
        }
    }

    public Character getItemInBothCompartments() {
        HashSet<Character> charactersInCommon = new HashSet<>(compartment1);
        charactersInCommon.retainAll(compartment2);
        return charactersInCommon.stream().findAny().get();
    }

    @Override
    public String toString() {
        return "Rucksack{" +
                "compartment1='" + compartment1 + '\'' +
                ", compartment2='" + compartment2 + '\'' +
                '}';
    }
}
