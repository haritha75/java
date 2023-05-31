package fashion;

public class Fashion {

    public String brand;
    public int price;
    public int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fashion{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
