package org.example.utils;

import org.example.player.Player;

import java.util.ArrayList;

public class Round {
    private ArrayList<Match<Player, Player>> matches;

    public Round() {
        this.matches = new ArrayList<>();
    }

    public void addMatch(Match<Player, Player> match) {
        this.matches.add(match);
    }

    public ArrayList<Match<Player, Player>> getMatches() {
        return matches;
    }
}
