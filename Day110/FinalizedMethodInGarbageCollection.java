public class FinalizedMethodInGarbageCollection {

    protected void finalize() throws Throwable {

        try {

            System.out.println("inside finalize methods of demo class.");
        }
        catch(Throwable e) {
            throw e;
        }
        finally {
            System.out.println("calling finalize method of the object class.");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        
        FinalizedMethodInGarbageCollection f = new FinalizedMethodInGarbageCollection();

        f.finalize(); //finalize method is used for cleanup activitity purpose.this method called by garbage collector before removing the object it callls.

    }

}