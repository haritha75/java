public class NestedClassMethod1 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.show();//here calling show function with in show function we have mock class and printed the variable.
        
    }
    
}
class Outer{
    void show(){

        System.out.println("hi");

        class Mock{//this one within the function.
            int x=11;
            
            }
        
        Mock m=new Mock();
        System.out.println(m.x);

    }
}


