//one class has a refernce to the another class.it is used to minimize the duplication of code as well as the bugs.also use psrent class object in sub class.
//it is aslo called composition.simply say, what things has to take and preparing some item.example prepparing pepsi, take sugar,water some ingcredients and prepearing it like this.

public class Has_A_Relationship {

    public static void main(String[] args) {
        

        System.out.println(b.getBlood());
    }
    
}
class Human {

    int age;
    double weight;
}
 class Haritha extends Human {

    Brain b = new Brain();

    b.setBlood(7); 


 }
 class Brain { 

    int blood;

    void setBlood(int li) {

       blood = li;
    }

    int getBlood() {

       return blood;
    }
}