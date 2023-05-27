public class GenericsInMethods1 {

//using generics code will be reducing  and duplicate also reducing.

    public static void main(String[] args) {



        Integer marks[] = {44,79,55,98,15,66};

       var x1 = addMarks("revi",marks);
        System.out.println(x1);

        Float marks2[] = {44.6f,77.f,98.0f,35.7f};
         var x2 =  addMarks("suresh",marks2);
        System.out.println(x2);




    }

    public static <T> T addMarks(T a,T marks1[]) { //using generics in methods we donot need more methods creation because generics accept any data types.but in methods without using generics every type create methods with different parameters.it takes somuch time
        System.out.println("Name: "+a); //in above first t is type of the value and second t is return type.

        for(var x : marks1) //here reading the all marks
            System.out.print(x+" ");
        System.out.println();
           return (T) (a+" Indian"); //here return type.


    }
}
