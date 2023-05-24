public class CreatingNewMethodsInAnonymousClass {

    public static void main(String[] args) {
        
        Mock m = new Mock() { //it is a anonymous class.it is used to without creating new class we are implementing interaface method.
            @Override
            public void nock() {
        
                System.out.println("hello guys!");
                hello();
            }

            public void  hello() { //we are not calling this methods directly beecause it does not containing in the mock class
                System.out.println("say hello!");
                hi();
            }

            public void hi(){ //we are not calling this methods directly beecause it does not containing in the mock class

                System.out.println("hi guys!");
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
