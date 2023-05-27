public class UsingBoundedTypeGenericInClass {

    public static void main(String[] args) {

        Nick<Feast> n = new Nick<>();
        System.out.println(n);
        Nick<Choco> c = new Nick<>();
        System.out.println(c);
       // Nick<Bogus> b = new Nick<>(); //here bpgus class extended only gun class not jonnas interfaces that's why it shows error.

    }
}
class Nick<T extends Gun & Jonnas> { //here we are  using bounded type generics which class extends the jonnas interface and gun class  that classes only allowed.

    Nick() {

    }
     public Nick(T a) {
        
    }


}
class Gun {

}
class Feast extends Gun implements Jonnas {

    double funFactor;

    public double getFunFactor() {
        return funFactor;
    }

    public void setFunFactor(double funFactor) {
        this.funFactor = funFactor;
    }

    Feast() {

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Feast{" +
                "funFactor=" + funFactor +
                '}';
    }
}
class Choco extends Gun implements Jonnas {

}
interface Jonnas {

}
class Bogus extends Gun {

}