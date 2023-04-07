public class ClassesAndMethod
{
public static void main(String args[])
{
Car c1=new Car();
c1.color="red";
Car c2=new Car();
c2.price=500000;
System.out.println(c1.color);
System.out.println(c2.price);
}
}
class Car
{
String color;
int price;
}

