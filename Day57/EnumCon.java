enum Places {

    ladakh(),ooty("ooty"),goa("small","relax");

    Places() {
        System.out.println("one of the beautiful place in india");
    }

    Places(String str) {

        System.out.println(str);
    }

    Places(String str,String s1) {

        System.out.println(str+" "+s1);
    }
    }
    
public class EnumCon {

    public static void main(String[] args) {
        
        var P = Places.ladakh;
    }
    
}
