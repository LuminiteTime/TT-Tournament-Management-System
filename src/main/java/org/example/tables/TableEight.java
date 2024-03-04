package org.example.tables;

import org.example.player.Player;
import org.example.utils.Match;
import org.example.utils.Round;

public class TableEight extends Table {
    public TableEight() {
        super();
    }

    @Override
    public void fillRounds() {
        Round round1 = new Round();
        round1.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(7)));
        round1.addMatch(new Match<Player, Player>(playersList.get(1), playersList.get(6)));
        round1.addMatch(new Match<Player, Player>(playersList.get(2), playersList.get(5)));
        round1.addMatch(new Match<Player, Player>(playersList.get(3), playersList.get(4)));
        this.allRounds.add(round1);

        Round round2 = new Round();
        round2.addMatch(new Match<Player, Player>(playersList.get(6), playersList.get(0)));
        round2.addMatch(new Match<Player, Player>(playersList.get(7), playersList.get(5)));
        round2.addMatch(new Match<Player, Player>(playersList.get(1), playersList.get(4)));
        round2.addMatch(new Match<Player, Player>(playersList.get(2), playersList.get(3)));
        this.allRounds.add(round2);

        Round round3 = new Round();
        round3.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(5)));
        round3.addMatch(new Match<Player, Player>(playersList.get(6), playersList.get(4)));
        round3.addMatch(new Match<Player, Player>(playersList.get(7), playersList.get(3)));
        round3.addMatch(new Match<Player, Player>(playersList.get(1), playersList.get(2)));
        this.allRounds.add(round3);

        Round round4 = new Round();
        round4.addMatch(new Match<Player, Player>(playersList.get(4), playersList.get(0)));
        round4.addMatch(new Match<Player, Player>(playersList.get(5), playersList.get(3)));
        round4.addMatch(new Match<Player, Player>(playersList.get(6), playersList.get(2)));
        round4.addMatch(new Match<Player, Player>(playersList.get(7), playersList.get(1)));
        this.allRounds.add(round4);

        Round round5 = new Round();
        round5.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(3)));
        round5.addMatch(new Match<Player, Player>(playersList.get(4), playersList.get(2)));
        round5.addMatch(new Match<Player, Player>(playersList.get(5), playersList.get(1)));
        round5.addMatch(new Match<Player, Player>(playersList.get(6), playersList.get(7)));
        this.allRounds.add(round5);

        Round round6 = new Round();
        round6.addMatch(new Match<Player, Player>(playersList.get(2), playersList.get(0)));
        round6.addMatch(new Match<Player, Player>(playersList.get(3), playersList.get(1)));
        round6.addMatch(new Match<Player, Player>(playersList.get(4), playersList.get(7)));
        round6.addMatch(new Match<Player, Player>(playersList.get(5), playersList.get(6)));
        this.allRounds.add(round6);

        Round round7 = new Round();
        round7.addMatch(new Match<Player, Player>(playersList.get(0), playersList.get(1)));
        round7.addMatch(new Match<Player, Player>(playersList.get(2), playersList.get(7)));
        round7.addMatch(new Match<Player, Player>(playersList.get(3), playersList.get(6)));
        round7.addMatch(new Match<Player, Player>(playersList.get(4), playersList.get(5)));
        this.allRounds.add(round7);
    }
}
