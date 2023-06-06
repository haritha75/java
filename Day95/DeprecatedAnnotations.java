//deprecated annotation are used when we are old version or deprecated or old method or variable or class  even we have better way to use that class or variables or methods that time mention this annotation.
//and also mentioning when we are not using marked element in long time that time also mentioning.
public class DeprecatedAnnotations {

    public static void main(String[] args) {

        Add a = new Add(4,7); //when you are trying to call deprecated annotation  methods or class  or constructorsit shows marked type.

        Add.add(8,9);


    }
}
@Deprecated //it menas if you have better way then mention deprecated int takes only int values but double take double,float,int values also.
class Add{

   @Deprecated
    Add(int a,int b) {
        System.out.println(a+b);

    }
   @Deprecated
    static void add(int a,int b) {
        System.out.println(a+b);
    }
}
class Add1 {
    Add1(double a,double b) {
        System.out.println(a+b);
    }
    static void add1(double a,double b) {
        System.out.println(a+b);
    }
}