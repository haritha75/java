public class Sample {

    public static void main(String[] args) {
        Rock r=new Mock() ; //here we  are creating object to the mock and reference is parent class so only parent class fields and method can access not child  because refence is parent class
        System.out.println(r.x);
        r.print();

    }
}

class Rock {

    int x=10;

    public void print() {
        System.out.println("hello.......");
    }
    public void hello() {

        System.out.println("hi...");
    }
}

class Mock extends Rock {

    int x =15;
    
    public void print() {
            System.out.println("say hi");
    }
}