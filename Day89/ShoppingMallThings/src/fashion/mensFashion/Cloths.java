package fashion.mensFashion;

import fashion.Fashion;

public class Cloths extends Fashion {

    private String clothType;
    private String clothSize;
    private String clothColor;

    public String getClothType() {
        return clothType;
    }

    public void setClothType(String clothType) {
        this.clothType = clothType;
    }

    public String getClothSize(int i) {
        return clothSize;
    }

    public void setClothSize(String clothSize) {
        this.clothSize = clothSize;
    }

    public String getClothColor() {
        return clothColor;
    }

    public void setClothColor(String clothColor) {
        this.clothColor = clothColor;
    }

    public void velvet() {
        System.out.println("velvet cloth type is better in summer season");
    }

    @Override
    public String toString() {
        return "Cloths{" +
                "clothType='" + clothType + '\'' +
                ", clothSize='" + clothSize + '\'' +
                ", clothColor='" + clothColor + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
