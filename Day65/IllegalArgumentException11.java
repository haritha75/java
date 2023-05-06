//whenever give illegal argument like age,weight,height that time it occurs.because that are  not negative value .this values always positive.
//it is a runtime exception.

public class IllegalArgumentException11 {
    int age;
    public void setAge(int age) {
        if(age<0) {
            throw new IllegalArgumentException("age must be greater than zero");
        }
        else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        IllegalArgumentException11 i = new IllegalArgumentException11();

        System.out.println("illegal argument exception.");
        try {
            i.setAge(-1); //here we set age -1 but age is always greater than 0.
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
