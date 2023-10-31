public class AbstractMethod {

    public static void main(String[] args) {
        
    }
    
}

// class Rock {

//     abstract  void hello() { // it show error if you have abstract method then make class as abstract
//     }
//}


abstract class Mock {

    abstract static void print(); //first we cannot write abstract method with static

}

class Shock extends Mock {

    static void print() {
        System.out.println("hello"); // here we cannot override the static methods
    }

}
