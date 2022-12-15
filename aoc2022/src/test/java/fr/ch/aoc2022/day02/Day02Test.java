package fr.ch.aoc2022.day02;

import fr.ch.aoc2022.util.FileReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day02Test {

    private FileReader fileReader = new FileReader("day02");
    private Day02 day02 = new Day02();

    @Test
    void example(){

        List<String> input = fileReader.readFile("example.txt");

        int result = day02.computeScore(input);

        assertThat(result).isEqualTo(15);
    }

    @Test
    void test1(){

        List<String> input = fileReader.readFile("input1.txt");

        int result = day02.computeScore(input);

        assertThat(result).isEqualTo(11841);
    }
}
