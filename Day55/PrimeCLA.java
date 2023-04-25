public class PrimeCLA {

    public static void main(String[] args) {
        

        for (var x:args) {

            int s = Integer.parseInt(x);
            int count=0;

            for(int i=1;i<=s;i++) {
             
                   if(s%i==0)
                     count++;
               }
           if(count==2 || count==1) {

                    System.out.println("prime "+s);
            }
           else {

                   System.out.println("not prime "+s);
          }
        }
    }
    
}
