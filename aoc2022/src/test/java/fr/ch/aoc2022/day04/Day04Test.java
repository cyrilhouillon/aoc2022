package fr.ch.aoc2022.day04;

import fr.ch.aoc2022.util.FileReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day04Test {

    private Day04 day04 = new Day04();
    private FileReader fileReader = new FileReader("day04");;

    @Test
    void sample(){

        List<String> input = fileReader.readFile("example.txt");

        long result = day04.howManyContainsTheOther(input);

        assertThat(result).isEqualTo(2l);
    }

    @Test
    void test(){

        List<String> input = fileReader.readFile("input.txt");

        long result = day04.howManyContainsTheOther(input);

        assertThat(result).isEqualTo(431L);
    }

    @Test
    void sample2(){

        List<String> input = fileReader.readFile("example.txt");

        long result = day04.howManyOverlaps(input);

        assertThat(result).isEqualTo(4l);
    }

    @Test
    void test2(){

        List<String> input = fileReader.readFile("input.txt");

        long result = day04.howManyOverlaps(input);

        assertThat(result).isEqualTo(823L);
    }

}
