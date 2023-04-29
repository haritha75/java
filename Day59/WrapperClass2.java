public class WrapperClass2 {

    public static void main(String[] args) {

        float x = 7.96f;
        MyFloat f = new MyFloat(33.66f); //wrapper class object
        float marks[] = {45.6f,87.4f,77.2f};
        float res = MyFloat.add(marks);

        System.out.println(res);
    }
}
class MyFloat {
    float value;
    MyFloat(float value) {
        this.value = value;

    }
    static float add(float arr[]) {
        float sum = 0;
        for(float i:arr)
            sum +=i;
        return sum;
        }

}
