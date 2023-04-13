public class NestedClassMethods3 {
    
}

    public static void main(String[] args) {
        Outer o=new Outer();
        o.show();//here calling show function with in show function we have mock class and printed the variable.
        
    }
    

class Outer{
   void rockObject(){

        System.out.println("hi");

        class Mock{//this one within the function.
            int x=11;
         int moon(){
                System.out.println("moon");
                return 5;
            }
            
            }
            Mock m=new Mock();
            System.out.println(m.moon());
        
       //Mock.moon();

    }
}





