public class InstanceOfKeywordEx {

    public static void main(String[] args) {

        Child c = new Child();
        Parent p = new Child();
        Parent p1 = new Parent();
        System.out.println(c instanceof Parent);
        System.out.println(c instanceof Child);
        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Child);
        System.out.println(p1 instanceof Parent);
        System.out.println(p1 instanceof Child);
        
    }
    
}
class Parent {

}
class Child extends Parent {

}