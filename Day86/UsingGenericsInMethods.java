//using generics code will be reducing  and duplicate also reducing.
public class UsingGenericsInMethods {

    public static void main(String[] args) {

        addTwoNum(3,6);
        addTwoNum(5.41f,"haritha");

    }

    public static <T> void addTwoNum(T a,T c) { //using generics in methods we donot need more methods creation because generics accept any data types.but in methods without using generics every type create methods with different parameters.it takes somuch time
        System.out.println(a+" "+c);
    }
}
