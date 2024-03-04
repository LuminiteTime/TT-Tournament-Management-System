package org.example.tables;

import org.example.player.Player;
import org.example.utils.Match;
import org.example.utils.Round;

public class TableFour extends Table {

    public TableFour() {
        super();
    }

    @Override
    public void fillRounds() {
        Round round1 = new Round();
        round1.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(3)));
        round1.addMatch(new Match<Player, Player>(playersList.get(1), playersList.get(2)));
        this.allRounds.add(round1);

        Round round2 = new Round();
        round2.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(2)));
        round2.addMatch(new Match<Player, Player>(playersList.get(1), playersList.get(3)));
        this.allRounds.add(round2);

        Round round3 = new Round();
        round3.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(1)));
        round3.addMatch(new Match<Player, Player>(playersList.get(2), playersList.get(3)));
        this.allRounds.add(round3);
    }
}
