public class PassCode {

    public static void main(String[] args) {
        
        Lock l1 = new Lock();
        boolean res = l1.checkPassCode(9752);
        System.out.println(res);
    }
    
}
class Lock {
    int passcode = 9752;
    boolean checkPassCode(int mycode) {
        if(passcode==mycode)
          return true;
        return false;  
    }
}