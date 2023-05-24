public class LambdaFunctionalInterface {


    public static void main(String[] args) {
        
        Mock m = (x,y) ->x*y; //if you have single line return type then mention like this.if you multiple lines then mention expressions type like this {};this one is lambda function  type.
        System.out.println(m.mul(10,9));

        Mock m1 = new Mock() { //anonymous class type
            
            @Override

            public int mul(int x,int y) {
                return x*y;
            }
        };
        System.out.println(m1.mul(3, 9));

    }
    
}
@FunctionalInterface

interface Mock {

    int mul(int x,int y);
}