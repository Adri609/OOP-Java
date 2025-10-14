public class Book {

    private String title, author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
    public void setAvailableCopies(int availableCopies) {
        if (availableCopies < 0) {
            System.out.println("Available copies can't be negative");
        } else {
            this.availableCopies = availableCopies;
        }
    }

    public int borrowCopy(){

        if (this.availableCopies > 0) {
            return this.availableCopies --;
        } else {
            return this.availableCopies;
        }

    }

    public int returnCopy(){
        return this.availableCopies ++;
    }
}
