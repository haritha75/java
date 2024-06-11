public class SampleEx {

    public static void main(String[] args) {


        AnimalEx an = new AnimalEx();
        an.print();


    }


}
  class AnimalEx { //super

    void print() {
        try {
            System.out.println(1/0);

        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("executed");
        }
    }

  }
