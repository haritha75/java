public class ObjectClass {

    public static void main(String[] args) {

        Rock r = new Rock();
        Object o = new Rock(); //its working because object class is parent of rock class.
        r.mock();
        System.out.println(r.toString()); //it also  send some address but here we are calling tostring method with object but that method not creating in rock class but its working because every class have object default .so every object have tostring method.
        System.out.println(r);   //it also send same address because in object class tostring method is default so if you call  r object then rock class inherinte object class methods defaultly because every class have object if class not inherite the other class.otherwise object class is parent class of  every class .
        System.out.println(r.getClass().getName()); //it methods also default methods in object class.
        System.out.println(r.getClass());   //it also same.


    }
    
}
//object class is default class.
class Rock extends Object{ //like this class Rock extends Object // here object class is a parent class of all class.it default extends the object class if you not inherite the other class.

    void mock() {
        System.out.println(toString()); //it returns some address. in below methods all are inherite from the object class.this methods all are in object.
        System.out.println(hashCode());
        System.out.println(getClass());
        System.out.println(getClass().getName());
    }

}