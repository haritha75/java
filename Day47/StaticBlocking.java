public class StaticBlocking {

    public static void main(String[] args) {
        
        Mock m=new Mock();
        Mock m1=new Mock();
        Mock m2=new Mock();



    }
    
}
class Mock {
    static int a;
    Mock() {

        System.out.println("it print how many time we create the object!");
    }

    static {

        System.out.println("static block print only one time no matters how many time create the object and no matter how many function in this class always first print static block");

    }
}
