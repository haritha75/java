public class TowerOfHanoi {

  public static void main(String[] args) {
    
   int disks = 3;

   towerOfHanoi(disks,'A','B','C');
   System.out.println();
  towerOfHanoiEx(disks,'A','B','C');

  }
  public static void towerOfHanoi(int disks, char source,char auxilary,char destination) {
    if(disks ==0)
    return;
    towerOfHanoi(disks-1, source, destination, auxilary);
    System.out.println(source+" "+destination);
    towerOfHanoi(disks-1, auxilary, source, destination);

  }
  public static void towerOfHanoiEx(int disks, char source,char auxilary,char destination) {
    if(disks ==1) {

      System.out.println(source+"->"+destination);
      return;
    }
    
    towerOfHanoi(disks-1, source, destination, auxilary);
    towerOfHanoi(1, source, auxilary, destination);
    towerOfHanoi(disks-1, auxilary, source, destination);

  }
  
}
