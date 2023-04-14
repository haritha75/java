public class StaticClass1 {
    public static void main(String[] args) {
        Rock.Nick.Duck.Cheetah d=new Rock.Nick.Duck.Cheetah();
        System.out.println(d.c);
        d.rock();
    }
    
}
class Rock{
    class Nick{
        int n=4;
        class Duck{
          static  int x=9;
            static int duck(){
                System.out.println("duck man!");
                return 5;
            }
            static class Cheetah{
                int c=duck();
                void rock(){
                    System.out.println("rock man!");
                }
            }
        }
    }
}