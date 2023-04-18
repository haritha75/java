public class Brute1 {
    


   static  int a[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}

        
    };
    public static void main(String[] args) {
        int c=0;
        do {
            c++;
            cells();

        }while(!isMagicSquare());
        display();
        System.out.println(c);


        
    }
    

public static boolean isMagicSquare() {
    int sum=a[0][0]+a[0][1]+a[0][2];

    //compare rows
    for(int i=0;i<3;i++) {

        if(a[i][0]+a[i][1]+a[i][2]!=sum)
        return false;
     }
 

    //compare cols

    for(int i=0;i<3;i++) {

       if(a[0][i]+a[1][i]+a[2][i]!=sum)
       return false;
    }
    
    return(a[0][0]+a[1][1]+a[2][2]==sum&&a[0][2]+a[1][1]+a[2][0]==sum);
}

 static void cells() {

   int fRow=(int)(Math.random()*3);
       int fCol=(int)(Math.random()*3);

       int sRow=(int)(Math.random()*3);
       int sCol=(int)(Math.random()*3);

       int temp=a[fRow][fCol];
       a[fRow][fCol]=a[sRow][sCol];
       a[sRow][sCol]=temp;


}

static void display() {
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}







