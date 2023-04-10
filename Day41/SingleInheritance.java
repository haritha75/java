public class SingleInheritance{
    public static void main(String[] args) {
        Apple a=new Apple();
        a.test();
        a.shape("round");
        a.color("red");

        
    }


}

class Fruit//superclass
{
    String color;
    String shape;

    void color(String color)
    {
        System.out.println("the color is: "+color);
    }

    void shape(String shape){
        System.out.println("shape is "+shape);
    }


}

class Apple extends Fruit{//it is a subclass of superclass.
    int weight;

    void test(){
        System.out.println("apple is too sweet");
    }
}