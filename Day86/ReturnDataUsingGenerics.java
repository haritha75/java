public class ReturnDataUsingGenerics {

    public static void main(String[] args) {

        var x=  getData(55);
        var x1 = getData(54.6f);
        var x2  =  getData(78.9866);
        var x4 = getData("true");

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x4);

    }
    public static <T> T getData(T a) { //see above we are writting different types but it will return  all types so it will return any types also.
        return a; //if you not using generics every data type creating new method it takes much time and also some data also repeating.
    }
}
