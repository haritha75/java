public class Constr
{
public static void main(String args[])
{
Hello h=new Hello("hari",22);
h.setX(10);//function calling with object
int res=h.getX();
System.out.println(res);
}
}
class Hello
{
int x;//instace variable
Hello()
{
System.out.println("hello man!");
}
Hello(String person,int age)
{
x=age;//22
System.out.println("two parameters");
}
Hello(int age,String person)//this also two parameters but first int after string. so different then previous one
{
System.out.println("constructor with two  different parameters");
}
Hello(String person,int age,String gender)//first person second int after string
{
System.out.println("constrctor with three parametes");
}
int getX()//get the vale
{
return x;
}
void setX(int x)//set the value .this. means instancew variable.if not using this. we are confusing whe two variable same.
{
this.x=x;//x=x means here not assigning instance variable value assigning above age value.
}
}
