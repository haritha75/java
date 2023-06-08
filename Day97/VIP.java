import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class InnerOuterAnnotations {
@Doc
    public static void main(String[] args) {
    }
//creating the annotaion inside the class.
        @Retention(RetentionPolicy.RUNTIME)
       private  @interface Doc { //private can be used with in the class only not accessing outside the class.inner classes have four modifiers.

        }


}
//creating annotaion outside the class.
@Retention(RetentionPolicy.RUNTIME)
public @interface VIP { //it is a outer annotation we can mention either public or  default like class. public means we can access anywhere and default it access within the package

}
@VIP

class Rock {

}