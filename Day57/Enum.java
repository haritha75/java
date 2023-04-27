//in this way enums are structured

enum Brnaches {
    cse,eee,civil,mechanical
};

class Branche { //this is the form of enum
    public static final String cse = "cse";
    public static final String eee = "eee";

    public static final String civil = "civil";

    public static final String mechanical = "mechanical";

}

public class  Enum {


    public static void main(String[] args) {
        
        var B = Branche.eee; //or Branches.eee;

        System.out.println(B);
    }
}