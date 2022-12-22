package fr.ch.aoc2022.day03;

import fr.ch.aoc2022.util.FileReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day03Test {

    private Day03 day03 = new Day03();
    private FileReader fileReader = new FileReader("day03");;

    @Test
    void sample(){

        List<String> input = fileReader.readFile("example.txt");

        int result = day03.sumOfPriorities(input);

        assertThat(result).isEqualTo(157);
    }

    @Test
    void test1(){

        List<String> input = fileReader.readFile("input.txt.txt");

        int result = day03.sumOfPriorities(input);

        assertThat(result).isEqualTo(8018);
    }

    @Test
    void sample2(){

        List<String> input = fileReader.readFile("example.txt");

        int result = day03.sumOfBadgesPriorities(input);

        assertThat(result).isEqualTo(70);
    }

    @Test
    void test2(){

        List<String> input = fileReader.readFile("input.txt.txt");

        int result = day03.sumOfBadgesPriorities(input);

        assertThat(result).isEqualTo(2518);
    }

}
