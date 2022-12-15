package fr.ch.aoc2022.day01;

import java.util.List;

public class Elf {

    private final List<Long> supplies;

    public Elf(List<Long> supplies) {
        this.supplies = supplies;
    }

    public List<Long> getSupplies() {
        return supplies;
    }

    public long getCaloriesCarried() {
        return supplies.stream()
                .mapToLong(Long::longValue)
                .sum();
    }
}
