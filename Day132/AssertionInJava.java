public class AssertionInJava {

    public static void main(String args[]) {
        int age =14;
        assert age>= 18: "cannot vote"; // here, condition wrong then jvm will throws an error named AssertError. 
        System.out.println("The voter's age is "+age);
        
    }
}