//Stringbuilder is like a string but string builder mutable means change the value but in string we cannot changed because if you chnage string then it will effect to the other objects.
//string builder intial capacity is 16.
public class StringBuilder11 {
    public static void main(String[] args) {
        

        StringBuilder sb = new StringBuilder("rock");
       
        sb.append("man"); //it is use adding the string.
        System.out.println(sb);

        StringBuilder b = new StringBuilder("dockman");
        var x = sb.compareTo(b); //it compares each character of both string if same it return 0.
        System.out.println(x);

       StringBuilder sd = new StringBuilder(); //ititally 16 if you mention like 10 then capacity will be 10.
       System.out.println(sd.capacity());

       System.out.println(b.charAt(3)); //it return 3 index character
       System.out.println(b.indexOf("a")); //it return first occurences of a in b string.
       System.out.println(sb.lastIndexOf("n"));
       System.out.println();
       StringBuilder s = new StringBuilder("string bulider");
       s.setCharAt(2, 'c'); //it set the c character in index 2.
       System.out.println(s);
       System.out.println(s.insert(7,"haritha")); //in 7 index we are insert  and remaining characters moves to next places.that means changing the string but in string we are not changing .stringbuilder we are changing.
       System.out.println(s.substring(3,6));
       System.out.println(s.delete(7, 8));
       System.out.println(s.replace(4, 9, "java"));    //here we are updating .   
       System.out.println(s.reverse());




   
    }

   
    

    
}
