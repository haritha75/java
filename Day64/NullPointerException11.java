//it is runtime exception type .when try to some operations on null on that time it occurs.

public class NullPointerException11 {

    public static void main(String[] args) {

        Mock m = new Mock();


      try {
          int x = m.r.length();
      }
      catch(NullPointerException e) {

          System.out.println(e.getMessage());
      }

    }
} 

class Mock {

    String r ; //here string default value null so null does not refer or point any place in the string pool. if you handle properly then it then we get exit code 0;
}