public class StaticBlock { //first main method class will be loaded whenver create  object  to the Mock class that time only mock class will be loaded. 
 
    public static void main(String[] args) { 


        Mock m = new Mock();
        Mock m1 = new Mock();


    }
}

class Mock {

    Mock() {

        System.out.println("constrctor print  every time calling");
    }

    static {

        System.out.println("it will excuted only once if you call different object with the same class and first static will beexcuted it will where placed no matters.");
    }


    
}