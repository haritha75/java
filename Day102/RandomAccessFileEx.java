import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {
        
        try {

               RandomAccessFile raf = new  RandomAccessFile("Rock.txt","rw");     //rw means read and write permission.
               System.out.println((char)raf.read());
               System.out.println((char)raf.read());

               System.out.println((char)raf.read());
               System.out.println(raf.getFilePointer()); //after reading the characters where you are in the position it will returns that positions.


               raf.write('x'); //whenever we use this one after 3 reads  means 3 caracters it will be write x in that file.
               raf.skipBytes(2); //it will skip  reading two characters or characters after two characters it will return next characters whenever we read the file.
               System.out.println((char)raf.read());
               System.out.println((char)raf.read());
               raf.seek(3); //it actually go to mentioning location or index. if you want go to back use this one.
               System.out.println((char)raf.read());
               System.out.println((char)raf.read());
               
               System.out.println(raf.getFilePointer()); //it return position of index where we read.
               System.out.println(raf.getFilePointer()-5); //it also used if you want go to first postion use this one also.

               raf.writeBytes("haritha"); //whatever we mention in this method that will be written in files.


            
               raf.close();
              }
              catch(Exception e) {
                System.out.println(e.getMessage());
              }
    }
    
}
