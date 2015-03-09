package P1;


public class Book implements Comparable<Book> {
    
    private final String title;
    private final String author;
    private final String isbn;
    
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    Book() {
        this("", "", "");
    }
       
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getIsbn() {
        return this.isbn;
    }
    
    public String toString() {
        String bookContent = null;
        if (getTitle() != null && getAuthor() != null && getIsbn() != null) {
            return bookContent = getTitle() + ", " + getAuthor() + ", ISBN: " + getIsbn() + '\n';
        }
        
        return bookContent;
    }
    
    //If the argument is less than the comparable obj return 1.
    //If they are equal return 2 else return 0.
    @Override
    public int compareTo(Book obj) {
        long isbn1 = Long.parseLong(obj.getIsbn());
        long isbn2 = Long.parseLong(getIsbn());
        
        if (isbn2 > isbn1) {
            return 1;
        } else if (isbn1 == isbn2) {
            return 2;
        } else {
            return 0;
        }
    }
    
}
