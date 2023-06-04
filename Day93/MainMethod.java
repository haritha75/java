public class MainMethod {

    public static void main(String[] args) {

        System.out.println("here,jvm will handle this main method means jvm passing the string array in main method then printed main method content whenever calling the main method .it happends at run time like this jvm will take javac MainMethod.main(String args[])");
        int a[] = {3,6,8,1,6};
        MainMethod.main(a); //here,we are calling the method create array explicitly.
        
    }
    static void main(int a[]) {
        System.out.println("here,we are creating int  array and passing the array in main method.that only it print that means here, we are creating the array explicitly");
    }
    
}
