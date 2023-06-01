import java.util.HashMap;

public class PlayerReady {

    static HashMap<Integer, Boolean> hashMap = new HashMap<>();
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            hashMap.put(i, true);
        }

        hashMap.put(7, false);


        hashMap.put(17, negation(hashMap.get(17)));

        hashMap.put(66, negation(hashMap.get(66)));

        System.out.println("Players ready: " + getPlayersReady());
    }
    
    static boolean negation(boolean prevState) {

        return !prevState;
    }

    static int getPlayersReady() {

        int count = 0;

        for(var x : hashMap.values()) {

            if(x)

                count++;

        }

        return count;
    }
}