//it is a modifier that stands for strict floating point .
//it is used for restrcting floating point calculations and ensuring the same result on every platform while performing operations in the floating point variable.
//floating point calculations shows different value in different platforms based on the processor to prevent this we are using Strictfp keyword.
//It is a platform independent.
//it as introduced in java version 1.2.

public class StrictfpKeyword {

    public strictfp double sum() {
        double d= 10e+10;
        double d1= 6e+09;
        return d+d1;
    }


    public static void main(String[] args) {

        StrictfpKeyword strictfpKeyword = new StrictfpKeyword();
        System.out.println(strictfpKeyword.sum());
        
    }
    
}
