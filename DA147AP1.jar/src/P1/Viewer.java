package P1;
import javax.swing.*;
import java.awt.*;


public class Viewer {
 private JTextArea textarea = new JTextArea();

 public Viewer(String title) {
 JFrame frame = new JFrame(title);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 textarea.setPreferredSize(new Dimension(500, 400));
 JScrollPane scroll = new JScrollPane(textarea,
 JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
 JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
 frame.add(scroll, BorderLayout.CENTER);
 textarea.setEditable(false);
 
 frame.pack();
 frame.setVisible(true);
 }

 public void clear() {
     if (textarea != null) {
         textarea.setText("");
     }    
 }
 
 public void addRow(Book b ) {
    String bookContent = b.toString();
   
    //Add the book to the output textarea as a formatted string.
    textarea.append(bookContent);
 }
 
 public void addRow(String book) {
     textarea.append(book);
 }
 
}
