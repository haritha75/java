public class Has_A_Relationship {

    public static void main(String[] args) {
        System.out.println(b.getBlood());
        
    }
    
}
class Human {

}
class Haritha extends Human { //it is a IS_A_relationship .because haritha is a human .car is a vehicle.like this.

    Brain  b= new Brain(); //it is a has_A_Relationship.because haritha has brain,legs,eyes.like car has engine,steerings,tiers.and COMPOSITION is also has_A relationship.composition means what ingredients are used to prepare a thing or a process.like composition of pepsi means preparing pepsi you are using sugar,some flavours used.that is called composition.

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