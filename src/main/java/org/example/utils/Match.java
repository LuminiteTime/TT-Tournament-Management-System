package org.example.utils;

public class Match<T, K> {
    private T first;
    private K second;
    private boolean isPlayed;

    public Match(T first, K second) {
        this.first = first;
        this.second = second;
        this.isPlayed = false;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    @Override
    public String toString() {
        StringBuilder matchString = new StringBuilder();
        return matchString.
                append(this.first.toString()).
                append(" : ").
                append(this.second.toString())
                .toString();
    }
}
