package org.example.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.player.BasePlayer;
import org.example.player.MockPlayerInput;
import org.example.player.Player;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WriterToJsonPlayers {

    public WriterToJsonPlayers() {
    }

    public void writeMockInput(ArrayList<MockPlayerInput> players) {
        String json = convertInputListToJson(players);
        String fileName = "mockPlayersInput.json";
        writeJsonToFile(json, fileName);
        System.out.println("JSON " + fileName + " successfully created.");
    }

    public void writeMockOutput(ArrayList<Player> players) {
        players.sort(Comparator.comparing(Player::getIndexInTable));
        players.sort(Comparator.comparing(Player::getTableIndex));
        String json = convertOutputListToJson(players);
        String fileName = "mockPlayersOutput.json";
        writeJsonToFile(json, fileName);
        System.out.println("JSON " + fileName + " successfully created.");
    }

    private static String convertInputListToJson(List<MockPlayerInput> players) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(players);
    }

    private static String convertOutputListToJson(List<Player> players) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(players);
    }

    private static void writeJsonToFile(String json, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
