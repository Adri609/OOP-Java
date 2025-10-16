import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    
    public Library(){
        books.add(new Book("Los pilares de la tierra", "Ken Follet", 20));
        books.add(new Book("Narnia", "C. S. Lewis", 30));
        books.add(new Book("Harry Potter", "J.K. Rowling", 32));
    }

    public void showAllBooks(){

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author " + book.getAuthor());
            System.out.println("Available copies: " + book.getAvailableCopies());
        }
    }

    private int countBooks() {
     
        int totalBooks = 0;
        for (Book book : books) {
            if(book != null){
                totalBooks++;
            }
        }
        return totalBooks;
    }
    
}
