import java.awt.*;
public class Area {

    public static void main(String[] args) {
        
        Point p = new Point(3,6);
        int areaResult = findArea(p,6);
        System.out.println(areaResult);


    }
    public static int findArea(Point p,int height) {

        return p.x*p.y*height;
    }
    
}
