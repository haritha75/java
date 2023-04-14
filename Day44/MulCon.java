public class MulCon {
    
    public static void main(String[] args) {
        Rock r=new Rock(10);
    }
    
}
class Stone{
    Stone(){
        this(22);//calling constrctuor with single parameter.
        System.out.println("0 stones");
    }
    Stone(int a){
        System.out.println("constrctor with single parameter.");
    }
}
class Rock extends Stone{
    Rock(){
        //this(11);
        super();//calling superclass emty constructor
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

