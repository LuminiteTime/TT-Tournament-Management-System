package org.example.tables;

import java.util.ArrayList;
import org.example.player.Player;
import org.example.utils.Round;

public class Table {
    protected final ArrayList<Player> playersList;
    protected ArrayList<Round> allRounds;

    public Table() {
        this.playersList = new ArrayList<>();
        this.allRounds = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.playersList.add(player);
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public ArrayList<Round> getAllRounds() {
        return allRounds;
    }

    public void fillRounds() {}

    @Override
    public String toString() {
        StringBuilder tableToString = new StringBuilder();
        String title = "№ || FirstName LastName || Rating";
        int maxLen = title.length();

        tableToString.append(title).append("\n");
        tableToString.append("=".repeat(maxLen)).append("\n");

        for (int j = 0; j < this.playersList.size(); j++) {
            int curLen = maxLen;
            Player player = this.playersList.get(j);

            StringBuilder indexString = new StringBuilder();
            indexString.append(player.getIndexInTable()).append(" || ");
            curLen -= indexString.length();

            StringBuilder ratingString = new StringBuilder();
            int spaceCount = 2;
            if (player.getRating() / 100 != 0) {
                spaceCount = 1;
            }
            ratingString.append(" ||").append(" ".repeat(spaceCount)).append(player.getRating());
            curLen -= ratingString.length();

            StringBuilder playersFullName = new StringBuilder();
            playersFullName.append(player.getFirstName()).append(" ").append(player.getLastName());
            playersFullName.append(" ".repeat(curLen - playersFullName.length()));

            tableToString.append(indexString).append(playersFullName).append(ratingString).append("\n");
        }
        return tableToString.toString();
    }
}
