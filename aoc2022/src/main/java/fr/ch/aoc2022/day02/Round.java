package fr.ch.aoc2022.day02;

public class Round {

    private final Shape opponent;
    private final Shape player;
    private final RoundResult result;

    public Round(Shape player, Shape opponent, RoundResult result) {
        this.player = player;
        this.opponent = opponent;
        this.result = result;
    }

    public int getScore() {
        return player.getInnerScore() + result.getScore();
    }
}
