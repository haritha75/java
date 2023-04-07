//write a program on java constrctors.
public class Constructor1
//more than two constrctors called constrctor overloading.
{
public static void main(String args[])
{
Rock r1=new Rock();//it means we call the constrctor.here no parameter so it choose only not declaring parameter
Rock r2=new Rock("haritha",22,"f");//here we call the constrctor first string second int and last one is string
Rock r3=new Rock("haritha");//here only string paramter calling
Rock r4=new Rock("haritha",22);//here string and int calling
Rock r5=new Rock(24,"sravani");//here int and string calling
Rock r6=new Rock("hari","f",28);//here string,string int
r2.sayHello();//function calling with object.
}
}
class Rock
{
Rock()//if you have parameterized constructor you have create empty or default constructor.
{
System.out.println("empty constrctors");//System.out.println("empty constrctors"); it will print empty.
}
Rock(String person)//parameterized constrctucor
{
System.out.println("constrctor with one parameter");
}
Rock(String person, int age)//do not use same parameter i mean only one parameter with string because already one string parameter declaring so declare with different parameters.here, first string after int declare
{
System.out.println("constrctor with two parameters");
}
Rock(int age,String person)//this also two parameters but first int after string. so different then previous one
{
System.out.println("constructor with two  different parameters");
}
Rock(String person,int age,String gender)//first person second int after string
{
System.out.println("constrctor with three parametes");
}
Rock(String person,String lang,int age)//first person seocnd string after int
{
System.out.println("constrctor with three  different parametes");
}
void sayHello()//fuction 
{
System.out.println("hello everyone");
}
}
