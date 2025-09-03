public class Book {
    // Private data members
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Display method
    public void displayBook() {
        System.out.println("The book " + this.title + " was written by " + this.author +
                           " and it has " + this.numberOfPages + " pages.");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating three Book objects
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 309);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book3 = new Book("1984", "George Orwell", 328);

        // Displaying books
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        // Updating number of pages for book1
        book1.setNumberOfPages(350);

        // Displaying book1 again
        book1.displayBook();
    }
}
