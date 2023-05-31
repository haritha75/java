package electronics;

public class SmartWatches extends Electronics{

    public double time;
    public String trackingFitnessGoals;
    public int resolution;
    public int internalStorage;

    OS os;


    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getTrackingFitnessGoals() {
        return trackingFitnessGoals;
    }

    public void setTrackingFitnessGoals(String trackingFitnessGoals) {
        this.trackingFitnessGoals = trackingFitnessGoals;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getInternalStorage() {
        return internalStorage;
    }

    public void setInternalStorage(int internalStorage) {
        this.internalStorage = internalStorage;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "SmartWatches{" +
                "time=" + time +
                ", trackingFitnessGoals='" + trackingFitnessGoals + '\'' +
                ", resolution=" + resolution +
                ", internalStorage=" + internalStorage +
                ", os=" + os +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", inches=" + inches +
                ", weight=" + weight +
                '}';
    }
}
