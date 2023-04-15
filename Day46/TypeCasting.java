import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt();
        int  c=(int)sc.nextFloat();//here we are taking float value and changing into int and then store into int variable.
        System.out.println(c*n);
    }
    
}

