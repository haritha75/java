public class MainCircle {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius();

        double area = circle.area(6.5);
        System.out.println(area);
        
        double circumference = circle.circumference(7);
        System.out.println(circumference);


        
    }

   
}
