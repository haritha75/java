public class StaticVsInitilizedVsConstructor {


    public static void main(String[] args) {

        Nock n = new Nock();
        Nock n1 = new Nock();
        

    }
    
}

class Nock {


    Nock() {

        System.out.println("it iwll excuted every time and it will print last");
    }


    {

        System.out.println("it will print every time whenever calling class with different objects but it print firsr compared to constructor and it will be print next compated static block");
    }

    static {

        System.out.println("it will print only once and it will print first when compared to initilized block and constructor");
    }
}
