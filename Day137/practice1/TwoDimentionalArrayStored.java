public class TwoDimentionalArrayStored {

  public static void main(String[] args) {
    
    int a[][] = new int[4][]; 
    // here we are mentioning rows only not column but tow dimentional stored inside the memory like are one dimentional array type for each row but here we are mentioning number of ellements in a row then it will stored intially null reference because it is a non-primitive

   // int a1[][]= new int[][2]; // it gives error it will not work but if you mentioning row size not column it works.
    System.out.println(a); //it will give address of a
    System.out.println(a[0]); //it will will give null because we are not mentionin size of each row sotred elements so it intialized to null
    
    //if you want then use like this

    for(int i=0;i<a.length;i++) { //it given number of rows

      a[i] = new int[5]; // here we are mentioning each row size

    }
    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[0].length;j++) {
       System.out.print(a[i][j]+" "); //it gives all zeros because we are menitoning any values
      }
      System.out.println();
    }
    System.out.println();

    for(int i=0;i<a.length;i++) { //it given number of rows

      a[i] = new int[i+1]; // here we are mentioning each row size that time it create size of that row means store number of elements with zero value

    }
     for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[i].length;j++) {
       System.out.print(a[i][j]+" "); //it gives all zeros because we are menitoning any values
      }
      System.out.println();
    }

  }
  
}
