public class ThisKeyword {
    public static void main(String[] args) {
        B  e=new B();
        e.grocery();
    }
    
}
class A{
    int rock;
    A(){

    }
    A(B bref){//just creating constrctor with one parameter with b class reference variable.
        System.out.println(bref.hound);//printing hound value.
    }
    int grocery(){
        B b=new B(this);//here creating b class object and calling b class constrctor with single parameter
        System.out.println("grocery");
        return 5;
    }
}
class B extends A{
    int hound=11;
    B(){

    }
    B(A aref){
        A a=new A(this);//here creating a class object and calling a class constrctor with single parameter.
    }
    public void nun(){

    }
}
