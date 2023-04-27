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

    void rock() {

        System.out.println(this.res+11);
    }
    

    }


public class EnumFun {

    public static void main(String[] args) {
        
        Places.ooty.rock();
    }
    
}
