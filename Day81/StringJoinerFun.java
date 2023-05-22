import java.util.StringJoiner;
public class StringJoinerFun {

//String joiner means  joining the different words in a single line using delimeter.

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner("-","@","*");

        sj.add("ramya");
        sj.add("haritha");
        sj.add("reddy");
        sj.add("vishala");

        System.out.println(sj);
        System.out.println(sj.length());
        System.out.println(sj.toString()); // it returns string

        StringJoiner sj1 = new StringJoiner("+");

        sj1.add("pink");
        sj1.add("black");
        sj1.add("purple");
        sj.merge(sj1);

        System.out.println(sj);


        StringJoiner sj3 = new StringJoiner("-");

        sj3.setEmptyValue("harika narayan is a singer"); //it means if stringjoiner is empty then  it will be working otherwise not working.

        System.out.println(sj3);

        StringJoiner sj4 = new StringJoiner("-");

        sj4.add("Virat Kohli ");
        sj4.add("M.S. Dhoni ");
        sj4.add("Sky ");

        sj4.setEmptyValue("Rohit"); //here it is not working because already we have values or lements or strings.

        System.out.println(sj4);

        StringJoiner sj5 = new StringJoiner("-");


        sj5.setEmptyValue("Iphone"); //here also not working because whenever it is empty then it storing and also adding some elements that time it removed and adding new elements.so adding new elements means it is not empty String.
        sj5.add("oppo");
        sj5.add("realme");
        sj5.add("vivo");
        sj5.add("redmi");

        System.out.println(sj5);


    }

}
