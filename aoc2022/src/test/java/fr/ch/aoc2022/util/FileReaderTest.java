package fr.ch.aoc2022.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FileReaderTest {

    @Test
    void should_read_file_from_resources() {
        List<String> result = new FileReader().readFile("test.txt");

        assertThat(result).containsExactly("1", "2", "3");
    }

    @Test
    void should_read_file_from_folder_in_resources() {
        List<String> result = new FileReader("day01").readFile("example.txt");

        assertThat(result).startsWith("1000", "2000", "3000");
    }
}
