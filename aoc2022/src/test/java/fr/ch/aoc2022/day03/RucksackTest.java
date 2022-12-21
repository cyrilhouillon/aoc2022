package fr.ch.aoc2022.day03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class RucksackTest {

    @Test
    void should_find_item_in_both_compartiments() {

        assertThat(rucksackFor("vJrwpWtwJgWrhcsFMMfFFhFp"))
                .extracting(Rucksack::getItemInBothCompartments)
                .isEqualTo('p');
        assertThat(rucksackFor("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"))
                .extracting(Rucksack::getItemInBothCompartments)
                .isEqualTo('L');
        assertThat(rucksackFor("PmmdzqPrVvPwwTWBwg"))
                .extracting(Rucksack::getItemInBothCompartments)
                .isEqualTo('P');
        assertThat(rucksackFor("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"))
                .extracting(Rucksack::getItemInBothCompartments)
                .isEqualTo('v');
        assertThat(rucksackFor("ttgJtRGJQctTZtZT"))
                .extracting(Rucksack::getItemInBothCompartments)
                .isEqualTo('t');
        assertThat(rucksackFor("CrZsJsPPZsGzwwsLwLmpwMDw"))
                .extracting(Rucksack::getItemInBothCompartments)
                .isEqualTo('s');
    }

    @Test
    void should_find_badge(){

        Rucksack r1 = rucksackFor("vJrwpWtwJgWrhcsFMMfFFhFp");
        Rucksack r2 = rucksackFor("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        Rucksack r3 = rucksackFor("PmmdzqPrVvPwwTWBwg");

        assertThat(Rucksack.findBadge(r1, r2, r3))
                .isEqualTo('r');
    }
    private Rucksack rucksackFor(String content) {
        return new Rucksack(content.substring(0, content.length()/2), content.substring(content.length()/2));
    }

}