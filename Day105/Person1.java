//here, we are create record keyword which is used to reduce the common data.
//here, we write only name and age then without any code it will print the data when we are enter the name and age.
//but in previous program using getter and setter and tostring methods and get th data.here record automatically or default give that data.without writing that in class

public final record Person1(String name,int age) { //this is the final class we cannot change once declaring the values.
    public Person1(String name, int age){ //if you use brackets  in constructor then use like this if you not use constructor with brackets then it defaultly it creates.
        System.out.println("i am excuting");
        this.name = name;
        this.age = age;

    }

  void sayHi() { // this is also final method we cannot override.
        System.out.println(this.name);
    }
     static void sayHello() { //this is also final method we cannot change.
         System.out.println("hello");
    }

}
