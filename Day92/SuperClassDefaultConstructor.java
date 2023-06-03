public class SuperClassDefaultConstructor {

    public static void main(String[] args) {
        C c = new C();
        System.out.println();
        C c1 = new C(1);

    }
}
class A {
A() { //whenever creating constructor and  if you not creating  parent class constructor here, then by default parent class empty constructor will be created.here also created this class parent class is object class  object class have only one mepty constructor but that constructor not containing anything.

    System.out.println("A");
   }
}

class B extends A {
    B() { //here jvm will check first line  if any constructor have are not if not then defaultly jvm create parent class empty constructor.means like this super().

        System.out.println("B");
    }
}
class C extends  B {

    C() { //here jvm will check first line  if any constructor have are not if not then defaultly jvm create parent class empty constructor.means like this super().

        System.out.println("C");
    }
    C(int x) { //here not creating any constructor then it will go to parent class empty constructor and again on that class also check creating any constructor if not then it will go on that class parent class like this it will calling.

        System.out.println("X"); //if you creating parent class constructor then jvm will not creating parent class  default constructor .
    }
}