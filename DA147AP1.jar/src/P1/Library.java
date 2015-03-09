package P1;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int size;
    private int capacity;
    
    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
        size = 0;
    }
    
    private void quicksort(Book[] array, int size) {
        int i, j;
        Book temp;
	for (i = 0; i != size; i++) {
            for (j = i + 1; j <= size; j++) {

                long isbnJ = Long.parseLong(array[j].getIsbn());
                long isbnI = Long.parseLong(array[i].getIsbn());

                int res = array[j].compareTo(array[i]);
                if (res == 0) {
                        //Swap.
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                }
            }
	}
    }
    
    public void  add(Book b) {
        if (capacity > size()) {           
             if (size >= 2) {
                 books[size] = b;
                 quicksort(books, size);
                  size += 1;
                  return;
             } else if (size == 1) {
                 int res = b.compareTo(books[size -1]);
                 if (res == 1 || res == 2) {                   
                     books[size] = b;
                      size += 1;
                 } else {
                     //swap.
                     Book temp = books[0];
                     books[0] = b;
                     books[1] = temp;
                     size += 1;
                 }
                 return;
                 
             } else { //size == 0
                 books[size] = b;
                 size += 1;
                 return;
             }          
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "You can not insert number of books beyond the max capacity!");
        }
       
    }

    public int size() {
        return size;
    }
    
    public String toString() {
        return "Bibliotek med " + size() + " böcker.";
    }
    
    //"Lägg märke till att list-metoden returnerar en Book-array med samma kapacitet som
    //antalet lagrade böcker."
    public Book[] list() {
        return books;
    }
}
