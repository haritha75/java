package ipl;

import players.Players;

import java.util.Arrays;

public class CSK extends IPLTeam {

    public CSK() {
        this.name = "Chennai Super Kings";

    }
    private Players players[];

    public Players[] getPlayers() {
        return players;
    }

    public void setPlayers(Players[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "CSK{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", brandAmbassador='" + brandAmbassador + '\'' +
                ", netWorth=" + netWorth +
                '}';
    }
}
