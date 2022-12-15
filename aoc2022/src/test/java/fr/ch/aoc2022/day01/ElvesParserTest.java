package fr.ch.aoc2022.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ElvesParserTest {

    @Test
    void should_parse_an_elf_with_only_one_supply(){

        List<String> input = List.of("1");

        List<Elf> result = new ElvesParser().parse(input);

        assertThat(result).hasSize(1);
        assertThat(result.get(0).getSupplies()).containsExactly(1l);
    }

    @Test
    void should_parse_an_elf_with_many_supplies(){

        List<String> input = List.of("1", "2", "3");

        List<Elf> result = new ElvesParser().parse(input);

        assertThat(result).hasSize(1);
        assertThat(result.get(0).getSupplies()).containsExactly(1l, 2l, 3l);
    }

    @Test
    void should_parse_many_elves(){

        List<String> input = List.of("1", "2", "", "3", "4", "", "5", "6", "7");

        List<Elf> result = new ElvesParser().parse(input);

        assertThat(result).hasSize(3);
        assertThat(result.get(0).getSupplies()).containsExactly(1l, 2l);
        assertThat(result.get(1).getSupplies()).containsExactly(3l, 4l);
        assertThat(result.get(2).getSupplies()).containsExactly(5l, 6l, 7l);
    }

    @Test
    void should_not_consider_last_blank_line(){

        List<String> input = List.of("1", "2", "");

        List<Elf> result = new ElvesParser().parse(input);

        assertThat(result).hasSize(1);
        assertThat(result.get(0).getSupplies()).containsExactly(1l, 2l);
    }
}
