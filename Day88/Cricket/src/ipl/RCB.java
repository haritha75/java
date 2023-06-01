package ipl;

import players.Players;

import java.util.Arrays;

public class RCB extends IPLTeam {

    public RCB() {
        this.name="Royal Challengers Bangalore";

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
        return "RCB{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", brandAmbassador='" + brandAmbassador + '\'' +
                ", netWorth=" + netWorth +
                '}';
    }
}
