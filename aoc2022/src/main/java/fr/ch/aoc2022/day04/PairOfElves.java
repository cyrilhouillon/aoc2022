package fr.ch.aoc2022.day04;

public record PairOfElves(Assignment elf1, Assignment elf2) {

    public boolean doesOneFullyContainsTheOther() {
        return elf1.fullyContains(elf2) || elf2.fullyContains(elf1);
    }

    public boolean doesOneOverlapsTheOther() {
        return (elf1.min() <= elf2.max() && elf2.min() <= elf1.max());
    }
}
