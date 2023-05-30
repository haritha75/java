public class WTC {

    private String playerNames;
    private  int jerseyNumber;

    public String getPlayerNames() {
        return playerNames;
    }

    public void setPlayerNames(String playerNames) {
        this.playerNames = playerNames;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "WTC{" +
                "playerNames='" + playerNames + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
