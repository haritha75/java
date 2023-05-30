import java.util.Arrays;

public class Object_Oriented_Thinking {

    public static void main(String[] args) {

        Cricket c = new Cricket();
        c.setTeamName("Indian");
        c.setExperience(50);

        RCB r = new RCB();
        r.setTeamName("RCB");
        r.setPlace("Banglore");
        r.setTrophies(0);
        r.setName("virat");

        RCB rcb[] = {r};
        c.setRcb(rcb);
        System.out.println(c);


        WTC w = new WTC();
        w.setJerseyNumber(18);
        w.setPlayerNames("Virat");

        WTC wtc[] = {w};
        r.setWtc(wtc);

        CSK c1 = new CSK();
        c1.setTrophies(5);
        c1.setCaptainName("M.S.Dhoni");
        c1.setPlace("Chennai");
        c1.setTeamName("CSK");

        CSK csk[] ={c1};
        c.setCsk(csk);
        System.out.println(c);



    }
}
class Cricket {

    private String teamName;
    private int experience;

    RCB rcb[];
    CSK csk[];

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public RCB[] getRcb() {
        return rcb;
    }

    public void setRcb(RCB[] rcb) {
        this.rcb = rcb;
    }

    public CSK[] getCsk() {
        return csk;
    }

    public void setCsk(CSK[] csk) {
        this.csk = csk;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "teamName='" + teamName + '\'' +
                ", experience=" + experience +
                ", rcb=" + Arrays.toString(rcb) +
                ", csk=" + Arrays.toString(csk) +
                '}';
    }
}