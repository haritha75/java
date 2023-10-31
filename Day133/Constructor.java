public class Constructor {

    public static void main(String[] args) {

        Mock m = new Mock(4); //here whenever creating object in that class all constrctor have placed in first line as a super if you not creating anythig and it will care about calling or not that constructor but it check all the constructor once whenever creating that class object
        m.print();
        
    }
    
}
class Rock {

    int a;
    

    Rock(int a) {

        this.a=a;

    }

    public void print() {
        System.out.println(a);
    }
}

class Mock extends Rock {

    Mock() {

    }

    Mock(int a) { //here whenver calling this construction in first line super class empty constructor will be here but we are not creating constructor in parent so that'w why it shows error
       super(2);
        System.out.println("hello");

    }

    public void print() {
        System.out.println(a);
    }

}