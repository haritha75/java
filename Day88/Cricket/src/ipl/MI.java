package ipl;

import players.Players;

import java.util.Arrays;

public class MI extends IPLTeam{

    public MI() {
        this.name="MUmbai Indians";

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
        return "MI{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", brandAmbassador='" + brandAmbassador + '\'' +
                ", netWorth=" + netWorth +
                '}';
    }
}
