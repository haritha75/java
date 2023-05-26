public class Generics12 {

    public static void main(String[] args) {

        Animal<Integer,String> deer = new Animal<>(5,"deer");
        Animal<Float,Integer>  d = new Animal<>(55.4f,7);

        System.out.println(deer.getAge());
        System.out.println(deer.getName());
        System.out.println(d.getName());
        System.out.println(d.getAge());


    }
}
class Animal<T,S> { //you choice to use more generics also.
    T age;
    S name;

    Animal(T t,S s) {
        this.age = t;
        this.name = s;
    }

    T getAge() {
        return age;
    }

    S getName() {
        return name;
    }


}
