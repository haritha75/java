public class MultipleInheritance {
    public static void main(String[] args) {
        Camel c=new Camel();
        c.setWeight(200);
        System.out.println(c.getWeight());
        System.out.println(c.area());
        c.eating("gross");

        
    }
    
}

class Animal{
    int weight;
    int height;
    String color;

    void walk(){
        System.out.println("different walk");
    }
    void eating(String eat){
        System.out.println("eating "+eat);

    }
}

class Deer extends Animal{
    void speed(int speed){
        System.out.println(speed+"km speed");
    }
}

class Cow extends Animal{
    void color(String color){
        System.out.println("cow color is "+color);
    }
}

class Camel extends Cow{
    private int weight;
    String place;
    void place(){
        System.out.println("camel living in "+place);

    }
    boolean area(){
       int a=getWeight();
        if(a>5)
            return true;
        
            return false;
        
    }
    int getWeight(){
        return weight;
    }
    void setWeight(int b)
    {
        this.weight=b;
    }
}

