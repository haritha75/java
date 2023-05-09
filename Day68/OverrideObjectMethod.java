//every class in java IS_A object.
public class OverrideObjectMethod {

    public static void main(String[] args) {

        Mock m =new Mock();
          
           System.out.println(m); //it default call the tostring method in mock class.iwthout mentioning tostring also it defaultly printing.
 
        System.out.println(m.toString());


    }
    
}
//it defautly mock class inherite the object class.see in below there is no object class but not showing error because object class is default in java.        

class Mock extends Object{ //if you not inherite other class then automatically it inherite the object class so object class methods all are belongs to mock class.

    @Override //mention like this if you overriding the method for better understanding.

    public String toString() { //here we are overriding the method without method we are not overriding.but tostring method is a part of object class object class is parent class of mock class.

        return "haritha";
    }
}
