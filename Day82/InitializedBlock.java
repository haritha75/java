//intialized block is used to reducing the code and reducing the duplicated elements or values.
//initialzed block like constructor  because if we calling constructor with different objects every time it will excuted like this initialized block will be every time excuted.
//intilialized block will be excuted first next constructor block will be excuted.
//if a class we have static ,intiallized blocks and constructor then first static next initialized blocks then constructor will be excuted. 
//initlized block will be written inside the method.
public class InitializedBlock {

    public static void main(String[] args) {


        Mock m = new Mock();
        Mock m1 = new Mock();

    
        

    }
}
class Mock{


     Mock() {

        System.out.println("say hello!");
     }


    {

        System.out.println("hello man!");
     }


}