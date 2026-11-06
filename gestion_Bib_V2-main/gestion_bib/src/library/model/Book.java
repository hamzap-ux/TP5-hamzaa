package library.model;
 
public class Book implements Lendable {
    private String title;
    private String author;
    private boolean borrowed;
 
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }
 
    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
        } else {
            System.out.println("This book is already borrowed.");
        }
    }
 
    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
 
    @Override
    public String getDescription() {
        return title + " by " + author;
    }
 
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return borrowed; }
}
 