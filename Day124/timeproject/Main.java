import time.*;
public class Main {

    public static void main(String[] args) {
        Time time = new Time(5,40,10);
        Time time1 = Time.addTwoTimes(new Time(3,30,15),time);
        time1.display();


    }

}