import java.util.Arrays;

//compare to hashmap array takes less space.
public class PlayerReadyUsingArray {

    static int a[] = new int[100]; //here each bit stores 4*8=32 bits then 32*100=3200 bits

    public static void main(String[] args) {
        
        Arrays.fill(a,1); //here all array values fill with 1.
        a[4]=0;
        a[12]=0;
        System.out.println(a[4]);

        System.out.println(getPlayersReady());
    }


        static int getPlayersReady() {

            int count = 0;
    
            for(int x : a) {
    
                if(x==1)
    
                    count++;
    
            }
    
            return count;
        }
    }
    

