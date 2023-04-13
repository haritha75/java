public class SuperAndSubclassFun {

    

    



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
         void moon(){
                System.out.println("moon landing");
            }
            
            }
       class Stone extends Mock{
        int x=8;
         void moon(){
                   System.out.println("noo moon");
               }
           Stone(){//constrctor
              
               
               //System.out.println(x);//here it will take child calss variable because it a local variable.if same variable name same it prefers child class variable.
               //super();//calling empty constrctor super class.also pass the value.
              moon();//here mock super class inherite into stone class so same function names soo if you call function it takes child class function.
              super.moon();//if you want super class function then mention. super.functionname();
              System.out.println(super.x);//super class variable.
              
           }
       }
        
       Stone s=new Stone();

    }
}






