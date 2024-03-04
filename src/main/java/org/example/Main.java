package org.example;

import org.example.exceptions.InvalidNumberOfPlayersException;
import org.example.mockData.MockPlayersData;
import org.example.player.MockPlayerInput;
import org.example.player.Player;
import org.example.tables.*;
import org.example.utils.WriterToJsonPlayers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        Tournament tournament = new Tournament();

        // Creating tables depending on the number of players.
        int numberOfPlayers = s.nextInt();
        s.nextLine();
        ArrayList<Table> tables = chooseTables(numberOfPlayers);
        tournament.setTablesList(tables);

        // Adding players to each table of the tournament.
//        MockPlayersData mockPlayersData = new MockPlayersData();
//        ArrayList<Player> allPlayers = mockPlayersData.readJson("players.json");
//        for (Player player: allPlayers) {
//            String firstName = player.getFirstName();
//            String lastName = player.getLastName();
//            int rating = player.getRating();
//
//            allPlayers.add(new Player(firstName, lastName, rating));
//        }

        ArrayList<Player> allPlayers = new ArrayList<>();
        ArrayList<MockPlayerInput> allInputPlayers = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            String[] input = s.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int rating = Integer.parseInt(input[2]);

            allPlayers.add(new Player(firstName, lastName, rating));
            allInputPlayers.add(new MockPlayerInput(firstName, lastName, rating));
        }

        // Add players into tables.
        WriterToJsonPlayers writerToJson = new WriterToJsonPlayers();
        writerToJson.writeMockInput(allInputPlayers);
        tournament.fillTables(allPlayers);
        writerToJson.writeMockOutput(allPlayers);

        // Print tables with players.
        tournament.displayTables();

        // Print rounds for each table.
        tournament.getOrderedMatches();
    }

    /**
     * Method for distributing number of players into 1 or 2 tables.
     * @param numberOfPlayers of Integer.
     * @return ArrayList of tables created depending on the number of players.
     */
    private static ArrayList<Table> chooseTables(int numberOfPlayers) throws Exception {
        if (numberOfPlayers < 4 || numberOfPlayers > 16) {
            throw new InvalidNumberOfPlayersException();
        }
        ArrayList<Table> tableList = new ArrayList<>();
        if (numberOfPlayers < 8) {
            tableList.add(new Table());
        } else {
            switch (numberOfPlayers % 2) {
                case 0:
                    int sizeOfTable = numberOfPlayers / 2;
                    tableList.add(chooseTypeOfTable(sizeOfTable));
                    tableList.add(chooseTypeOfTable(sizeOfTable));
                    break;
                case 1:
                    tableList.add(chooseTypeOfTable((numberOfPlayers + 1) / 2));
                    tableList.add(chooseTypeOfTable((numberOfPlayers - 1) / 2));
                    break;
            }
        }
        return tableList;
    }

    private static Table chooseTypeOfTable(int sizeOfTable) throws Exception {
        return switch (sizeOfTable) {
            case 4 -> new TableFour();
            case 5 -> new TableFive();
            case 6 -> new TableSix();
            case 7 -> new TableSeven();
            case 8 -> new TableEight();
            default -> throw new Exception();
        };
    }
}
