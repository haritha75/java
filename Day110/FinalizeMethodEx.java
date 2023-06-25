public class FinalizeMethodEx {

    private int id;
    public FinalizeMethodEx(int id) {

        this.id = id;
    }
    @Override

    protected void finalize() throws Throwable { //here, overriding the finalize method it is used for cleaning the activities.

        System.out.println("object with id"+id+"is being destroyed");
        super.finalize();
    }

    public static void main(String[] args) {
        
        FinalizeMethodEx f = new FinalizeMethodEx(2);
        FinalizeMethodEx f1 = new FinalizeMethodEx(3);
        FinalizeMethodEx f2 = new FinalizeMethodEx(4);

        f1 = null;
        f2 =null;

        System.gc(); //calling garbage collector explicitly.

        f= null;

        System.gc(); //calling garbage collector explicitly.






    }
    
}
