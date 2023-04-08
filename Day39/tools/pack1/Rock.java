package pack1;

public class Rock {
   private int  getA()//it will not private use in this package of file not another pakcage
    {
        return 5;//its proper way just understanding.
    }
    int getAdding()
    {
        return getA();//it means getA() function in private if you want that number so use another function and retturn that private function.
    }
}
