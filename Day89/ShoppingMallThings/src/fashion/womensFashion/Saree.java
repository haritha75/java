package fashion.womensFashion;

import fashion.Fashion;

public class Saree extends Fashion {

    private String sareeType;
    private String sareeColor;
    private int sareeLength;

    public String getSareeType() {
        return sareeType;
    }

    public void setSareeType(String sareeType) {
        this.sareeType = sareeType;
    }

    public String getSareeColor() {
        return sareeColor;
    }

    public void setSareeColor(String sareeColor) {
        this.sareeColor = sareeColor;
    }

    public int getSareeLength() {
        return sareeLength;
    }

    public void setSareeLength(int sareeLength) {
        this.sareeLength = sareeLength;
    }

    @Override
    public String toString() {
        return "Saree{" +
                "sareeType='" + sareeType + '\'' +
                ", sareeColor='" + sareeColor + '\'' +
                ", sareeLength=" + sareeLength +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
