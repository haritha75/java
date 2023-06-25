//it is used for copy the  excate object.here if you change one object it ill not effect to the other object.
//disadvantage of this one is if you have 1000 values  then 1000 times we have to assign the values.
public class DeepCopy {

    public static void main(String[] args) {
        

        SBI sbi = new SBI();

        sbi.a =22;
        sbi.b =13;
        sbi.c=14;
        

        System.out.println(sbi.a);
        System.out.println(sbi.b);
        System.out.println(sbi.c);

        SBI s1 = new SBI();

        s1.a = sbi.a;
        s1.b =sbi.b;
        System.out.println(s1.a);
        System.out.println(sbi.a);
       



    }


    
}
class SBI  {

    int a;
    int b;
    int c;

    void print() {

        System.out.println("hello.......");
    }
}

