package fr.ch.aoc2022.day02;

public class Round {

    private final Shape opponent;
    private final Shape player;
    public Round(String round) {
        opponent = Shape.forCode(round.substring(0, 1));
        player = Shape.forCode(round.substring(2, 3));
    }

    public int getScore() {
        return player.getInnerScore() + player.against(opponent).getScore();
    }
}
