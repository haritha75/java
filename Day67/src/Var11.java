public class Var11 {

    public static void main(String[] args) {
        
        System.out.println("hellow world");
        System.out.println(rock());

        int a[] = {3,7,9,4,6,1};

        for(var c: a) { //in for each loop also it works.
            System.out.print(c);
        }
    }
    

static {
    var x3 =13; //in static block var datatype works

    System.out.println(x3);
  }
  static int rock() {
    
        var x= 33; //int static method also it will work.
  
    return x;
  }
}