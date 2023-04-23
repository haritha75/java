public class Passcode {
    public static void main(String[] args) {

        Lock l = new Lock();

        for(int i=1000;i<10000;i++) {

            if(l.checkPassCode(i)) 

                System.out.println("key"+i);
            
        }
         

    }
}
class Lock {
    int passcode = (int)Math.floor((Math.random()*9000.0+1000.0));

    boolean checkPassCode(int mycode) {

        if(passcode==mycode)
        return true;
     return false;   
    }
}