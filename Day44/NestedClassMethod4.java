public class NestedClassMethod4 {
    



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
        static int moon(){
                System.out.println("moon");
                return 5;
            }
            
            }
       class Stone extends Mock{
        int x=8;
           Stone(){
               System.out.println(x);//here it will take child calss variable because it a local variable.if same variable name same it prefers child class variable.
           }
       }
        
       Stone s=new Stone();

    }
}





