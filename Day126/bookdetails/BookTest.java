import bookdetails.Book;
import bookdetails.SpecialEditionBook;

import javax.swing.text.html.HTMLDocument;

public class BookTest {

    public static void main(String[] args) {

        SpecialEditionBook specialEditionBook = new SpecialEditionBook("The Lion",350,15);
        specialEditionBook.display();




    }
}