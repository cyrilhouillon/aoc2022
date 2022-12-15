package fr.ch.aoc2022.day02;

import java.util.function.Function;

public interface RoundParser extends Function<String, Round> {

    Round parse(String line) ;

    @Override
    default Round apply(String s) {
        return parse(s);
    }
}
