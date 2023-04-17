public class Rock1 {

    public static void main(String[] args) {
        
        Nick.Hybrid.Mock.sum();
    }
}

class Nick {

    class Hybrid {

        class Mock {

           public  static void sum() {
                System.out.println("hello guys!");
            }
        }
    }

}