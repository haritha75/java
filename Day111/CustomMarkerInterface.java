 class CustomMarkerInterface {

    public static void main(String[] args) {

        Vehicle.isVehicle();
        Status.isworking();
        
    }
 }

 interface Car {

 }
 interface Engine {

 }

 class Vehicle  implements Car {

    static void isVehicle() {

        System.out.println("car is vehicle");

    }
 }
 class Status implements Engine {

    static void isworking() {

        System.out.println("engine is working");
    }
 }