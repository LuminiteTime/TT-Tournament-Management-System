package org.example;

import org.example.player.Player;
import org.example.tables.Table;
import org.example.utils.Match;
import org.example.utils.Round;

import java.util.ArrayList;
import java.util.Comparator;

public class Tournament {
    private ArrayList<Table> tablesList;

    Tournament() {
        this.tablesList = new ArrayList<>();
    }

    public void setTablesList(ArrayList<Table> tablesListToAdd) {
        this.tablesList.clear();
        this.tablesList.addAll(tablesListToAdd);
    }

    public void fillTables(ArrayList<Player> allPlayers) {
        int tableIndex = 0;
        allPlayers.sort(Comparator.comparing(Player::getRating));
        for (int i = allPlayers.size() - 1; i >= 0; i--) {
            Player player = allPlayers.get(i);
            this.tablesList.get(tableIndex).addPlayer(player);
            tableIndex = (tableIndex + 1) % this.tablesList.size();
        }
        for (int j = 0; j < this.tablesList.size(); j++) {
            Table table = this.tablesList.get(j);
            table.fillRounds();
            for (int i = 0; i < table.getPlayersList().size(); i++) {
                Player player = table.getPlayersList().get(i);
                player.setIndexInTable(i + 1);
                player.setTableIndex(j + 1);
            }
        }
    }

    public ArrayList<Table> getTablesList() {
        return tablesList;
    }

    public void displayTables() {
        for (Table table: this.tablesList) {
            System.out.print(table.toString());
            System.out.println();
        }
    }

    public void getOrderedMatches() {
        for (int i = 0; i < this.getTablesList().size(); i++) {
            System.out.println("++++++++++ " + "Table " + (i + 1) + " ++++++++++");
            for (Round round: this.getTablesList().get(i).getAllRounds()) {
                for (Match<Player, Player> match: round.getMatches()) {
                    if (!match.isPlayed()) {
                        System.out.println(match);
                    }
                }
                System.out.println();
            }
        }
    }
}
