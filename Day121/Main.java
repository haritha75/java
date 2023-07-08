public class Main {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.setAnimalName("cow");
        System.out.println(a.getAnimalName());

        a.setAge(2);
        System.out.println(a.getAge());
        
        a.setColor("white");
        System.out.println(a.getColor());


    }
}