package fr.ch.aoc2022.day01;

import fr.ch.aoc2022.util.FileReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day01Test {

    @Test
    void sample(){

        List<String> input = new FileReader("day01").readFile("example.txt");

        long result = new Day01(new ElvesParser()).maxCarriedCalories(input);

        assertThat(result).isEqualTo(24000l);
    }

    @Test
    void test1(){

        List<String> input = new FileReader("day01").readFile("test1.txt");

        long result = new Day01(new ElvesParser()).maxCarriedCalories(input);

        assertThat(result).isEqualTo(73211L);
    }
}
