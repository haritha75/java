import java.util.Arrays;

public class RCB {

    private String name;
    private String teamName;
    private String place;
    private int trophies;
    private WTC[] wtc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public WTC[] getWtc() {
        return wtc;
    }

    public void setWtc(WTC[] wtc) {
        this.wtc = wtc;
    }

    @Override
    public String toString() {
        return "RCB{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", place='" + place + '\'' +
                ", trophies=" + trophies +
                ", wtc=" + Arrays.toString(wtc) +
                '}';
    }
}
