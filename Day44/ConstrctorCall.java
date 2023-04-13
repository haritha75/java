public class ConstrctorCall {
    public static void main(String[] args) {
        Rock r=new Rock();
    }
    
}
class Rock{
    Rock(){
        this(11);
        System.out.println("0 parameters");
    }
    Rock(int a){
        this(22,7);
        System.out.println("1 patameter");
    }
    Rock(int a,int b){
        System.out.println(" 2 parameters");
        
    }
}
