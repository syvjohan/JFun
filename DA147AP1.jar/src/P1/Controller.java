package P1;


public class Controller {
    private Library library;
    private Viewer viewer;
    private Book book;
    
    public Controller(Library library, Viewer viewer) {
        this.library = library;
        this.viewer = viewer;
        
        addToLibrary();
        updateViewer();
    }
    
    public void getInput(String title, String author, String isbn) {
        this.newBook(title, author, isbn);
        this.addToLibrary();
        this.updateViewer();
    }
    
    private Book newBook(String title, String author, String isbn) {
        book = new Book(title, author, isbn);
        return book;
    }
    
    private void addToLibrary() {
        if (book != null) {
            boolean len = checkLength(book.getIsbn(), 18);
            if (len) { 
                library.add(book); }
            else {
                javax.swing.JOptionPane.showMessageDialog(null, "You can not insert a ISBN with more than 18 numbers!");
            }
        }      
    }
    
    private void updateViewer() {
        viewer.clear();
        
        Book[] b = library.list();
        for (int i = 0; i != library.size(); ++i) {
            viewer.addRow(b[i]);
        }
                
    }
    
    private boolean checkLength(String obj, int len) {
        if (obj.length() > len) {
            return false;
        }
        return true;
    }

}
