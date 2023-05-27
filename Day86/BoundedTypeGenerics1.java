public class BoundedTypeGenerics1 {
    public static void main(String[] args) {

        onlyAllowingNumType(22);
        onlyAllowingNumType(22.5f);
        onlyAllowingNumType(5L);
        onlyAllowingNumType(5.0087);
        //onlyAllowingNumType("true");
         //onlyAllowingNumType("haritha");
       // onlyAllowingNumType('c');
    }

    //here means bounded type generics alllows only one class but it allows more interfaces
    public static <T extends Number> void  onlyAllowingNumType(T a) { //here extends number class so it allows only number type values whatever the subclasses of number class that all subclasses will be allowed.
        System.out.println(a);
    }
}
