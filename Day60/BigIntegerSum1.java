public class BigIntegerSum1 {

    public static void main(String[] args) {
        

        MyBigInteger a = new MyBigInteger("123");
        MyBigInteger b = new MyBigInteger("423");
        String res = a.add(b);


        System.out.println(res);
    }
    
}
class MyBigInteger {

    String value;

    MyBigInteger(String s) {

        this.value = s;

    }

    public  String add(MyBigInteger x) {

        String num1 = this.value;
        String num2 = x.value;
        int carry = 0;
        String sum = "";
        int i,j;

        for(i=num1.length()-1,j =num2.length()-1; i>-1 && j>-1;i--,j--) {

            int temp = (Integer.parseInt(String.valueOf(num1.charAt(i)))+Integer.parseInt(String.valueOf(num2.charAt(j)))+carry);

            sum += temp%10;
            carry = (temp/10);


        }

        while(i>-1) {
            int temp = (Integer.parseInt(String.valueOf(num1.charAt(i)))+carry);

            sum += temp%10;
            carry = (temp/10);
            i--;
        }


        while(j>-1) {
            int temp = (Integer.parseInt(String.valueOf(num2.charAt(j)))+carry);

            sum += temp%10;
            carry = (temp/10);
            j--;
        }

        if(carry>0) 
          
            sum +=carry;

         String rev = "";
         for(var x1:sum.toCharArray())
         
             rev = x1+rev;

         return rev;           

    }

}