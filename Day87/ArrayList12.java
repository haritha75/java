import java.util.Arrays;

public class ArrayList12 {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add(90);
        myArrayList.add(85);
        myArrayList.add(45);
        myArrayList.add(57);
        myArrayList.add(86);
        myArrayList.add(75);
        System.out.println(myArrayList.get(5));
        System.out.println(myArrayList);
        System.out.println(myArrayList.getSize());
        System.out.println(myArrayList.contains(7));
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.set(2,43));
        System.out.println(myArrayList.size);
        System.out.println(myArrayList);
        
    }
    
}
class MyArrayList {

    int count ;

    int arr[];
    int size;

    MyArrayList() {

        arr = new int[10];
    }

    MyArrayList(int size) {

        this.size = size;
        arr = new int[size];
    }

    void add(int value) {

        if(count == size) {
             
            int arr2[] = new int[size+(size)/2];
            for(int i=0;i<arr.length;i++)
                arr2[i] = arr[i];
             
            arr = arr2;    
            }
            arr[count++] = value;

            if(count>size)
              size++;
        }
      int get (int index) {

        if(index>arr.length-1)
            throw new IndexOutOfBoundsException();

        return arr[index];

    }
    boolean contains(int value) {
        for(var x: arr) {
            if(x==value)
          return true;
        }
        return false;


    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "count=" + count +
                ", arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    int getSize() {

        return size;
    }

    boolean isEmpty() {
        if(size==0)
          return  true;
        return false;

    }
    int set(int ind,int value) {
        return arr[ind] = value; //here updating the value at index 2.
    }


}




