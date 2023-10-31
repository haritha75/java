public class CodeOptimizations {

    public static void main(String[] args) {
        
        int a=12/6*3; //6

        if(++a>=6 || ++a<5) //here it check first condition if true then it doesnot go to second condition
           System.out.println(a);//7

        if(++a>9 || ++a<11 ) //here if first not true then it come to second condition it a increases if not true then it will not print but a will be increases
          System.out.println(a);   //9
          
       if( ++a>10 && ++a<=11) //here first a increses and check then condition and again increases and check condition if first condition false then it does not goto the second condition not increases.
         System.out.println(a);    //here because first a =9 it increase 10 then ut check condition but false then it does not to the next conditon but a will be 10

        System.out.println(a); //10
    }
    
}
