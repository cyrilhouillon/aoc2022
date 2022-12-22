package fr.ch.aoc2022.day04;

public record Assignment(Integer min, Integer max) {
    boolean fullyContains(Assignment assignment) {
        return min() <= assignment.min() && max() >= assignment.max();
    }
}
