package fashion.mensFashion;

import fashion.Fashion;

public class Watches extends Fashion {

    private String color;
    private String  watchType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWatchType() {
        return watchType;
    }

    public void setWatchType(String watchType) {
        this.watchType = watchType;
    }

    @Override
    public String toString() {
        return "Watches{" +
                "color='" + color + '\'' +
                ", watchType='" + watchType + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
