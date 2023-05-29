//parent object is not instance of child.
//if refernce is parent type and object is child type then its return true.
public class InstanceOfKeywordEx2 {

    public static void main(String[] args) {

        Parent p = new Parent();
        Parent c = new Child();
        System.out.println(p instanceof Child);
        System.out.println(c instanceof Child);
        
    }
    
}
class Parent {

}
class Child extends Parent {

}