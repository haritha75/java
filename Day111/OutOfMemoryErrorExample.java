//all objects stored in a heap.They are allocated using a new operator.
//outofmemoryerror is thrown when the jvm cannot allocate an object because it is out of memeory.No more memory could be made available by the garbage collector.

//OutOfMemoryError : means holding too long objects or trying to process too much data at a time.sometimes,this  type of problems are not our control.
//Java Heap space : This error arises due to the applications that make excessive use of finalizers.if a class has a finalize method,objects of the type donot have their space reclaimed at garbage collector time.


import java.util.ArrayList;

import java.util.*;

public class OutOfMemoryErrorExample {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[1000000 * 1000000];
    }
}