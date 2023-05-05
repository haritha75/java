public class ClassNotFoundException11 {

    public static void main(String[] args) {
        

        System.out.println("rock");
;
        try {
            
            Class.forName("HelloWorld");     
           }

        catch(ClassNotFoundException e) { //it is compile time exception because ic occurs compile time only.

            e.printStackTrace();
        }

        try {

            Class.forName("hi");
        }

        catch(ClassNotFoundException ex) {

            ex.printStackTrace();
        }
    }
    
}
