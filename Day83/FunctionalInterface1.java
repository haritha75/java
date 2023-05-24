public class FunctionalInterface1 {

    public static void main(String[] args) {

        Mock m = new Mock() { //it is a anonymous class.it is used to without creating new class we are implementing interaface method.
            @Override
            public void nock() {

                System.out.println("hello guys!");
            }
        };
        m.nock();
        
    }
    
}

//functional interaface nothing but interface class contain only one method.

@FunctionalInterface

interface Mock {

    void nock();


}
