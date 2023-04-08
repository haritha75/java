//write a program on classes
public class Classes
{
public static void main(String args[])
{
Car bmw=new Car();
bmw.play(1);
Car p=new Car();
p.price=40000;//it is not proper way.it shows errors because price varible in private we not accesing .so you can use setters and getters method.
System.out.println(p.price);
p.setPrice(50000);//this one is good .calling function with object
System.out.println(p.getPrice());
Car c=new Car();
c.setColor("red");//setting the function with object and then printing with getfunction.
System.out.println(c.getColor());
Car y=new Car();
y.years(4);
Car s=new Car();
s.changeSpeed(false);
}
}
class Car
{
//attributes or properties
String color;
private int years;
private int price;// it is in private so not using other class.
String company;
String song[]={"dhoom","akasam","beast"};
//methods or function 
void changeSpeed(boolean increase)
{
if(increase)
System.out.println("speed too fast");
else
System.out.println("speed too low");
}
void play(int id)
{
System.out.println(song[id]);
return;
}
void years(int n)//actually years private but it working in another class because here we are declaring. and calling another class.here not using getters and setters method just declaring method and calling another method.
{
System.out.println("how many years it working");
}
//getters or setters
int getPrice()
{
return price;
}
void setPrice(int pr)
{
price=pr;
return;
}
String getColor()
{
return color;
}
void setColor(String x)
{
color=x;
}
}
