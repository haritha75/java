import java.util.StringTokenizer;

public class StringTokenizer11 {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("hello world java course learning","o"); //o is the delimeter

        while(st.hasMoreTokens())

           System.out.println(st.nextToken("e")); //here every space after it will print new line.if uou mention delimeter then that will be removed and next character print in new line.here e is the delementer.
        

    }
    
}
