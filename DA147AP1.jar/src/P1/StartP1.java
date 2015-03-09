package P1;

public class StartP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*String res="";
    Library library = new Library(5); // Max 100 böcker kan lagras
    library.add(new Book("En oväntad semester", "Keyes", "4"));
    library.add(new Book("How to Program", "Deitel", "2"));
    library.add(new Book("Testamentet", "Grisham", "3"));
    library.add(new Book("Legionärerna", "Enquist", "1"));
    library.add(new Book("En oväntad semester", "Keyes", "4"));
    res += "Antal lagrade böcker: " + library.size();
    res += "\n" + library.toString();
    Book[] books = library.list();
    res += "\nKapacitet på böcker: " + books.length;
    for(int i=0; i<books.length; i++) {
        if (books[i] != null) {
            res += "\n" + books[i].toString();
        }
        
    }
        
    javax.swing.JOptionPane.showMessageDialog(null, res);*/
        
    /*Viewer viewer = new Viewer("Bokvisare");
    Book b1 = new Book("En oväntad semester", "Keyes", "9176436314");
    Book b2 = new Book("How to Program", "Deitel", "0131290142");
    Book b3 = new Book("Testamentet", "Grisham", "9176437175");
    Book b4 = new Book("Legionärerna", "Enquist", "9174483463");
    viewer.clear();
    viewer.addRow(b1.toString());
    viewer.addRow(b2.toString());
    viewer.addRow(b3.toString());
    viewer.addRow(b4.toString());*/
        
    Library library = new Library(100);
    library.add(new Book("How to Program", "Deitel", "0131290142"));
    library.add(new Book("En oväntad semester", "Keyes", "9176436314"));
    library.add(new Book("Testamentet", "Grisham", "9176437175"));
    library.add(new Book("Legionärerna", "Enquist", "9174483463"));
    Viewer viewer = new Viewer("Bokvisare");
    Controller controller = new Controller(library, viewer);
    Input input = new Input(controller);
    }
    
}
