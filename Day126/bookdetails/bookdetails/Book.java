package bookdetails;

public class Book {
    private int bookNo;
    private String bookName;
    private double bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
    public void display() {
        System.out.println(this);
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return (int) bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}

