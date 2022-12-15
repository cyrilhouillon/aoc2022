package fr.ch.aoc2022.day02;

import org.junit.jupiter.api.Test;

import static fr.ch.aoc2022.day02.RoundResult.*;
import static fr.ch.aoc2022.day02.Shape.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ShapeTest {

    @Test
    void rock_should_win_over_scissors() {
        assertThat(ROCK.against(SCISSORS)).isEqualTo(VICTORY);
        assertThat(SCISSORS.against(ROCK)).isEqualTo(DEFEAT);
    }

    @Test
    void scissors_should_win_over_paper() {
        assertThat(SCISSORS.against(PAPER)).isEqualTo(VICTORY);
        assertThat(PAPER.against(SCISSORS)).isEqualTo(DEFEAT);
    }

    @Test
    void paper_should_win_over_rock() {
        assertThat(PAPER.against(ROCK)).isEqualTo(VICTORY);
        assertThat(ROCK.against(PAPER)).isEqualTo(DEFEAT);
    }

    @Test
    void same_shape_should_draw() {
        assertThat(ROCK.against(ROCK)).isEqualTo(DRAW);
        assertThat(PAPER.against(PAPER)).isEqualTo(DRAW);
        assertThat(SCISSORS.against(SCISSORS)).isEqualTo(DRAW);
    }
}
