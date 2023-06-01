import ipl.CSK;
import ipl.MI;
import ipl.RCB;
import players.Country;
import players.Players;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static <CSk> void main(String[] args) {
        RCB rcb = new RCB();
        rcb.setBrandAmbassador("ranveer singh");
        rcb.setNetWorth(69_00_00_000);

        Players player1 = new Players();
        player1.setName("virat");
        player1.setAge(34);
        player1.setCountry(Country.INDIA);

        Players player2 = new Players();
        player2.setName("AB DEVILLERS");
        player2.setAge(39);
        player2.setCountry(Country.SOUTHAFRICA);



        Players rcbPlayers[] = {player1,player2};
        rcb.setPlayers(rcbPlayers);
        System.out.println(rcb);

        CSK csk = new CSK();
        csk.setBrandAmbassador("sachin");
        csk.setNetWorth(90_00_00_000);

        Players p1 = new Players();
        p1.setName("M.S.Dhoni");
        p1.setAge(41);
        p1.setCountry(Country.INDIA);

        Players p2 = new Players();
        p2.setName("jadeja");
        p2.setAge(34);
        p2.setCountry(Country.INDIA);

        Players cskPlayers[] = {p1,p2};
        csk.setPlayers(cskPlayers);
        System.out.println(csk);

        MI mi = new MI();
        mi.setBrandAmbassador("pankaj tripathi");
        mi.setNetWorth(30_00_00_000);

        Players m1 = new Players();
        m1.setName("Rohit Sharma");
        m1.setAge(37);
        m1.setCountry(Country.INDIA);

        Players m2 = new Players();
        m2.setName("Surya Kumar Yadav");
        m2.setAge(32);
        m2.setCountry(Country.INDIA);

        Players miPlayers[] = {m1,m2};
        mi.setPlayers(miPlayers);
        System.out.println(mi);



    }
}