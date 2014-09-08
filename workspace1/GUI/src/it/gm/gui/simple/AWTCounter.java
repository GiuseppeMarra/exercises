package it.gm.gui.simple;

import java.awt.*;       // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces
 
// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {
   private Label lblCount;   // Declare component Label
   private TextField tfCount; // Declare component TextField
   private Button btnCount;  // Declare component Button
   private int count = 0;    // Counter's value
 
   /** Constructor to setup GUI components and event handling */
   public AWTCounter () {
      setLayout(new FlowLayout());
        // "super" Frame sets its layout to FlowLayout, which arranges the components
        //  from left-to-right, and flow to next row from top-to-bottom.
 
      lblCount = new Label("Counter"); // construct Label
      add(lblCount);                   // "super" Frame adds Label
 
      tfCount = new TextField("0", 10); // construct TextField
      tfCount.setEditable(false);      // set to read-only
      add(tfCount);                    // "super" Frame adds tfCount
 
      btnCount = new Button("Count");  // construct Button
      add(btnCount);                   // "super" Frame adds Button
 
      btnCount.addActionListener(this);
        // Clicking Button source fires ActionEvent
        // btnCount registers this instance as ActionEvent listener
 
      setTitle("AWT Counter"); // "super" Frame sets title
      setSize(250, 100);       // "super" Frame sets initial window size
 
     // System.out.println(this);
     // System.out.println(lblCount);
     // System.out.println(tfCount);
     // System.out.println(btnCount);
 
      setVisible(true);        // "super" Frame shows
 
     // System.out.println(this);
     // System.out.println(lblCount);
     // System.out.println(tfCount);
     // System.out.println(btnCount);
   }
 
   /** The entry main() method */
   public static void main(String[] args) {
     // Invoke the constructor to setup the GUI, by allocating an instance
      AWTCounter app = new AWTCounter();
   }
 
   /** ActionEvent handler - Called back upon button-click. */
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count; // increase the counter value
     // Display the counter value on the TextField tfCount
      tfCount.setText(count + ""); // convert int to String
   }
}

