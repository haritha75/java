  import java.util.HashMap;
  public class PlayerReadyusingHashMap {



    static HashMap<Integer, Boolean> hashMap = new HashMap<>();//here each player can store 4*8 and 2*8 =48 bits then 48*100 = 4800 bits
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            hashMap.put(i, true);
        }

        hashMap.put(7, false);
        System.out.println(hashMap.get(17));
        System.out.println(hashMap.get(7));



        

        System.out.println("Players ready: " + getPlayersReady());
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