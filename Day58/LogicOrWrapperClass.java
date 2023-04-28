import java.lang.Boolean;
public class LogicOrWrapperClass {

    public static void main(String[] args) {

        int b1 = Boolean.compare(false,true);
        System.out.println(b1);
        int res = 78;
        boolean a = 87<90; // true condition.
        System.out.println(Boolean.logicalOr(a, false));
        boolean b2 = Boolean.logicalAnd(4>7, 9<10);
        System.out.println(b2);
        boolean b3 = Boolean.logicalXor(1>2, 2>1);
        System.out.println(b3);
        Boolean b4 = Boolean.valueOf("hi");
        System.out.println(b4);
        boolean res3 = Boolean.parseBoolean("true");
        System.out.println(res3);


        
    }
    
}
