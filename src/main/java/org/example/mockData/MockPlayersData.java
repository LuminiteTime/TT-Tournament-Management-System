package org.example.mockData;

import com.google.gson.Gson;
import org.example.player.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class MockPlayersData {

    public MockPlayersData() {
    }

    public ArrayList<Player> readJson(String jsonFilePath) {
        Player[] reviews = new Gson().fromJson(jsonFilePath, Player[].class);
        return (ArrayList<Player>) Arrays.asList(reviews);
    }
}
