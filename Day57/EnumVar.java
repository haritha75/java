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

    int res;
    int print() {

        System.out.println("man!");
        this.res=11;
        return res;
    }

    }
    

public class EnumVar {

    public static void main(String[] args) {
        
        var P = Places.ladakh.print();

        System.out.println(P);


    }
    
}
