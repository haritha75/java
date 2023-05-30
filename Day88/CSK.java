public class CSK {

    private String captainName;
    private String teamName;
    private String place;
    private int trophies;

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
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

    @Override
    public String toString() {
        return "CSK{" +
                "captainName='" + captainName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", place='" + place + '\'' +
                ", trophies=" + trophies +
                '}';
    }
}
