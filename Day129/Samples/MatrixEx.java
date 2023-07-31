import java.util.Scanner;
public class MatrixEx {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[][]=new char[3][3];
        int index=0;
        for(int i=0;i<3;i++)
         {
        for(int k=0;k<3;k++) {
        ch[i][k]=str.charAt(index++);
        }
      }
          System.out.println("---------");
             for(int h=0;h<3;h++) {
               System.out.print("| ");
                   for(int l=0;l<3;l++) {
                          System.out.print(ch[h][l]+" ");
                    }
                           System.out.println("|");
        }
                           System.out.println("---------");
   }
}

