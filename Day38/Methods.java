//write a program on methods or function
public class Methods
{
int x;//instance variable.
public static void main(String args[])
{
int y;
Methods ob=new Methods();
ob.setX(15);//calling function with object.
System.out.println(ob.getX());
}
int getX()//if you use static method mention static int getX() like this.now we are using with the reference of object so not use static 
{
return x;
}
void setX(int val)
{
x=val;
}
}

