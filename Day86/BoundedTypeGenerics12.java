import java.io.Serializable;

public class BoundedTypeGenerics12 {

    public static void main(String[] args) {

        getData(new Bird());
        getData(new Hook()); //hook class allows because it is a subclass of bird class whenever extends hook class not allowing bird class because it is a parent class

    }

    public static<T extends  Bird> void  getData(T h) { //here bird class only becauese it does not have any subclasses and gold class is not subclass of bird class.
        System.out.println(h);
    }
}
class Bird {

    int age;
    int children;

    public Bird() {

    }

    public Bird(int age, int children) {
        this.age = age;
        this.children = children;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                ", children=" + children +
                '}';
    }
}
class Gold {

}
class Hook extends Bird implements Mock,Kick {

}
interface Mock {

}
interface  Kick {

}