import java.lang.Character;
public class CharacterWrapperClass {

    public static void main(String[] args) {
        
        Character s = Character.toUpperCase('a');
        System.out.println(s);
        char s1 = Character.toLowerCase(s);
        System.out.println(s1);
        char s2 = Character.valueOf('9');
        System.out.println(s2);
        String s3 = Character.toString('k');
        System.out.println(s3);
        
    }
    
}
