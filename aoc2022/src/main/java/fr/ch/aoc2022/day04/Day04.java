package fr.ch.aoc2022.day04;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day04 {
    public long howManyContainsTheOther(List<String> input) {
        return input.stream()
                .map(this::parse)
                .filter(PairOfElves::doesOneFullyContainsTheOther)
                .count();
    }

    private PairOfElves parse(String input) {
        // Définition de l'expression régulière pour extraire les 4 nombres entiers
        String regex = "(\\d+)-(\\d+),(\\d+)-(\\d+)";

        // Compilation de l'expression régulière
        Pattern pattern = Pattern.compile(regex);

        // Création d'un objet Matcher à partir de l'expression régulière et de la chaîne de caractères 'input'
        Matcher matcher = pattern.matcher(input);

        // Vérification de la correspondance de l'expression régulière avec la chaîne de caractères 'input'
        if (matcher.matches()) {
            // Récupération des 4 nombres entiers à partir des groupes de l'expression régulière
            int n1 = Integer.parseInt(matcher.group(1));
            int n2 = Integer.parseInt(matcher.group(2));
            int n3 = Integer.parseInt(matcher.group(3));
            int n4 = Integer.parseInt(matcher.group(4));

            return new PairOfElves(new Assignment(n1, n2), new Assignment(n3, n4));
        }

        return null;
    }

    public long howManyOverlaps(List<String> input) {
        return input.stream()
                .map(this::parse)
                .filter(PairOfElves::doesOneOverlapsTheOther)
                .count();
    }
}
