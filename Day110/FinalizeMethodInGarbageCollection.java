//garbage collection calling the finalize method before destroying the objects for cleanup activities.finalize method calling only once.
//cleanup activities means if you have any connection after removing the reference variable like fileinputstreams and database connection it will be removed or cleaned or closed that connection and also you choice if you have any condition and statements you can write in this finalize method.
public class FinalizeMethodInGarbageCollection {

    public static void main(String[] args) {

        FinalizeMethodInGarbageCollection f = new FinalizeMethodInGarbageCollection();
        System.out.println(f.hashCode());

        f= null;
        System.gc(); //calling garbage collector like this.
        System.out.println("end of garbage collector.");

    }
    @Override
    protected void finalize() { //finalized is a method  object class.
        
        System.out.println("finalized method called");
    }
    
}
