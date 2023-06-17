public record Person3(String name,int age) {

    public Person3( int age) {
        this("haritha",age); ///it is means whenever calling the single parameterized constructor then it will print two parameterized because we are mentioning here two parameterized.

    }
    public Person3() {
        this("rocky",19);
        System.out.println("whenever calling empty constructor then it will  return this block statements.");
    }
}
