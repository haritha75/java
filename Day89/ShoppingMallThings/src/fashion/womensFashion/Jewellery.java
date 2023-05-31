package fashion.womensFashion;

import fashion.Fashion;

public class Jewellery extends Fashion {

    private String jewelleryType;
    private String jewelleryDesign;

    public String getJewelleryType() {
        return jewelleryType;
    }

    public void setJewelleryType(String jewelleryType) {
        this.jewelleryType = jewelleryType;
    }

    public String getJewelleryDesign() {
        return jewelleryDesign;
    }

    public void setJewelleryDesign(String jewelleryDesign) {
        this.jewelleryDesign = jewelleryDesign;
    }

    @Override
    public String toString() {
        return "Jewellery{" +
                "jewelleryType='" + jewelleryType + '\'' +
                ", jewelleryDesign='" + jewelleryDesign + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
