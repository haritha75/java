public class Enum1 {
    

//enum means select only one option from fixed no.of options.


    public static void main(String[] args) {

        var e = EngBranches.CSE;
        
        System.out.println(e);

    }
}

enum EngBranches {

    ECE,
    CIVIL,
    CSE,
    EEE,
    MECHANICAL,
    CHEMICAL,
    ROBOTICS,
    AEROSPACE

    

};