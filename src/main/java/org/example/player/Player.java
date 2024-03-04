package org.example.player;

public class Player extends BasePlayer {
    private int tableIndex;
    private int indexInTable;

    public Player(String firstName, String lastName, int rating) {
        super(firstName, lastName, rating);
    }
    public int getIndexInTable() {
        return indexInTable;
    }

    public void setIndexInTable(int indexInTable) {
        this.indexInTable = indexInTable;
    }

    public int getTableIndex() {
        return tableIndex;
    }

    public void setTableIndex(int tableIndex) {
        this.tableIndex = tableIndex;
    }

    @Override
    public String toString() {
        StringBuilder playerString = new StringBuilder();
        return playerString
                .append("№").
                append(this.indexInTable)
                .append(" ")
                .append(this.getFirstName())
                .append(" ")
                .append(this.getLastName())
                .toString();
    }
}
