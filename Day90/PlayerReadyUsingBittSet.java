import java.util.BitSet;

public class PlayerReadyUsingBittSet {

    static BitSet players = new BitSet(); //here each players takes only one bit then 100 players takes 100 bits only.

    public static void main(String[] args) {

        players.set(0,64,true);
        players.clear(4); //here clearing means 4th element will be removed means false.
        System.out.println(players.get(4));
        players.clear(26);
        players.clear(64);
        System.out.println(players);

        
    }

    
}
