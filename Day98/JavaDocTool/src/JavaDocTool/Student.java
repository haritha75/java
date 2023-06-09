/**
 * @author Haritha
 * @verrsion 1.0
 * @since 2019
 */
package JavaDocTool;

/**
 * Student class stores  all the information about student.
 */
public class Student {

    /**
     * collegeCode method is static method because every college contains only one code.
     * use of static method you cannot override.If you want to that feature then use static method.
     * @value 1215647 is the default value for all the student.
     */
    static String collegeCode = "1215647";
    /**
     * name will be set by the student
     * default String value is null
     */

    String name;

    /**
     * every class contain empty  or default constructor if not having parameterized constructor.
     * if you create parameterized constructor you must create empty constructor.
     */
    Student() {
        System.out.println("it is a empty constructor");
    }
    Student(String name) {
        this.name = name;
    }

    /**
     *
     * @param a contain weight .
     * @return returns the weight value in int type
     //* @deprecated deprecated annotation used to if not used long way anything or if you better option compared to another one then mention deprecated annotation.
     * @deprecated outdated method
     */
    @Deprecated

    public int studentWeight(int a) {
        return a;
    }

    /**
     * @param a contains weight in double type.
     * @return returns weight value in double type
     */
    public double studentWeight(double a) {
        return a;

    }

    /**
     * @param regNo contains student regNo
     * @return returns the student name.
     */
    public String studentName(int regNo) {
        return this.name;
}
    /**
     * Issue a id card to a student
     * @param regNo enter a hallticket number
     * @throws Exception if  regNo invalid then throws the Exception.Exception that may be thrown from the getIDCard.
     */
    public void getIDCard(int regNo) throws Exception {

    }

    /**
     * @param str enter or pass the String to that function
     * @return it returns the boolean value if student contains the scholarship.
     */
    boolean hasScholarship(String str) {
        return true;

    }

}