public class ObjectEx1 {
    
    public static void main(String[] args) {

    Mock m = new Mock(); 
        System.out.println(m.toString());
    }
}
class Rock {  //here defaultly extends the object class.

}
class Mock extends Rock { //extending the rock class so rock class all properties inherite into the mock class. 
    
    int x;
    
}