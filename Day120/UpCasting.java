//upcasting is the typecasting of a child object to a parent object  and it can be done implicly.
//it gives flexibility to access the parent class members  but not possible to access child class members.
 class UpCasting {

    public static void main(String[] args) {

        Parent p = new Child(); //child class object to a parent class object so that's why we can access only parent class members.
        p.hello();

        
        
    }
    
}

class Parent {

    void hello() {
        System.out.println("hello.......");
    }

}

class Child extends Parent {

    void hi() {
        System.out.println("say hi..........");
    }
}