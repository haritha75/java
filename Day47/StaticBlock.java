public class StaticBlock {

    public static void main(String[] args) {
        
        Animal a2=new Animal();
        Animal a3=new Animal();
        Animal a4=new Animal();
        Animal a5=new Animal();


    }
    
}

class Animal {

    static int a=10;

    Animal() {

        System.out.println("wait! i am comming guys!"+a);

    }

    static {

        System.out.println(a);
    }
}