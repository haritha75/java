package car;
public class Car {

    private String nameOfTheCar;
    DirectionOfCar directionOfCar;
    private double positionOfTheCar;

    public String getNameOfTheCar() {

        return nameOfTheCar;
    }

    public void setNameOfTheCar(String nameOfTheCar) {

        this.nameOfTheCar = nameOfTheCar;
    }

    public DirectionOfCar getDirectionOfCar() {

        return directionOfCar;
    }

    public void setDirectionOfCar(DirectionOfCar directionOfCar) {
        this.directionOfCar = directionOfCar;
    }

    public double getPositionOfTheCar() {
        return positionOfTheCar;
    }

    public void setPositionOfTheCar(double positionOfTheCar) {
        this.positionOfTheCar = positionOfTheCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfTheCar='" + nameOfTheCar + '\'' +
                ", directionOfCar=" + directionOfCar +
                ", positionOfTheCar=" + positionOfTheCar +
                '}';
    }

    public Car() {
        nameOfTheCar = "";
        positionOfTheCar =0;

    }
    public  void Turn() {
        setDirectionOfCar(DirectionOfCar.EAST);
    }
    public void Turn(DirectionOfCar directionOfCar) {
        setDirectionOfCar(directionOfCar);
    }

    public void move(double distance) {
        setPositionOfTheCar(distance);

    }


}
