import java.util.Scanner;
public class EmptyAndBlankStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = "  ";
        
        if(s.isEmpty() || s.isBlank()) {
            s = "haritha";
            System.out.println(s);
        }

        String str = "  ";

        while(str.isEmpty()|| str.isBlank()) {
            System.out.println("enter name:");
            str = sc.next();
        }
        System.out.println(str);



    }
    
}
