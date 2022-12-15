package fr.ch.aoc2022.day01;

import fr.ch.aoc2022.util.FileReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day01Test {

    private Day01 day01 = new Day01(new ElvesParser());;
    private FileReader fileReader = new FileReader("day01");;

    @Test
    void sample(){

        List<String> input = fileReader.readFile("example.txt");

        long result = day01.maxCarriedCalories(input);

        assertThat(result).isEqualTo(24000l);
    }

    @Test
    void test1(){

        List<String> input = fileReader.readFile("test1.txt");

        long result = day01.maxCarriedCalories(input);

        assertThat(result).isEqualTo(73211L);
    }

    @Test
    void sample_test2(){

        List<String> input = fileReader.readFile("example.txt");

        long result = day01.maxCarriedCalories(3, input);

        assertThat(result).isEqualTo(45000l);
    }

    @Test
    void test2(){

        List<String> input = fileReader.readFile("test1.txt");

        long result = day01.maxCarriedCalories(3, input);

        assertThat(result).isEqualTo(213958L);
    }
}
