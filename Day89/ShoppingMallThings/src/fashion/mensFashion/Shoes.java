package fashion.mensFashion;

import fashion.Fashion;

public class Shoes extends Fashion {

    private int shoesSize;
    private String ShoesColor;

    public int getShoesSize() {
        return shoesSize;
    }

    public void setShoesSize(int shoesSize) {
        this.shoesSize = shoesSize;
    }

    public String getShoesColor() {
        return ShoesColor;
    }

    public void setShoesColor(String shoesColor) {
        ShoesColor = shoesColor;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "shoesSize=" + shoesSize +
                ", ShoesColor='" + ShoesColor + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
