package bookdetails;

public class SpecialEditionBook extends Book {

   public SpecialEditionBook(String bookName,double price,double discount) {

       setBookNo(getNum());
       setBookName(bookName);
       double discount1 = price/100*discount;
       setBookPrice((int) (price-discount1));
       setDiscount(discount);

}
private int getNum() {
       return (int)(Math.random()*101);
}
    private int discount;
    @Override
    public String toString() {
        return "SpecialEditionBook{" +
                "bookNo=" + getBookNo() +
                ", bookName='" + getBookName() + '\'' +
                ", bookPrice=" + getBookPrice() +
                ", discount=" + getDiscount()/100*getBookPrice()+
                '}';
    }

    @Override
    public void display() {
        super.display();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = (int) discount;
    }
}
