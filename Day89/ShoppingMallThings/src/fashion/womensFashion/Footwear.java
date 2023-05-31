package fashion.womensFashion;

import fashion.Fashion;

public class Footwear extends Fashion {

    private String footwearType;
    private String Color;
    private int footwearSize;

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getFootwearSize() {
        return footwearSize;
    }

    public void setFootwearSize(int footwearSize) {
        this.footwearSize = footwearSize;
    }

    @Override
    public String toString() {
        return "Footwear{" +
                "footwearType='" + footwearType + '\'' +
                ", Color='" + Color + '\'' +
                ", footwearSize=" + footwearSize +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
