//is a relationship is a one class inherits another class. reduce the redundancy and it is a code reusability.

public class IS_A_Relationship {

    public static void main(String[] args) {
        
        Vehicle d = new Vehicle();

        d.setVehicleName("bmw"); //here bmw is a vehicle but not vehicle is a bmw.

        System.out.println(d.getVehicleName());
    }
    
}
class Vehicle {

    private String  vehicleName;

    public void setVehicleName(String vehicleName) {

        this.vehicleName = vehicleName;

    }

    public String getVehicleName() {

        return this.vehicleName;
    }
}