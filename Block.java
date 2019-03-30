import javax.swing.JButton;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javafx.event.Event.*;

public class Block extends JButton implements ActionListener{

public Boolean mine;
public Boolean clicked;
public Boolean Testclicked;
public int minesaround;
private JButton R;  
  
  public Block() {
    R= new JButton(); 
    R.isEnabled();
    
    this.addActionListener(this);
                  }
  
  public void actionPerformed(ActionEvent e){ 
    Object o = e.getSource();
   if(o != null) 
   {System.out.println("works");}
   
  }
  public String toString() {
    if (mine && clicked) {return "m";} // Trigger the event class to end game also if an error arises convert using indexof
    else if (Testclicked) {return "x";}//prevent clicking
    else if (clicked && minesaround>0){String.valueOf(minesaround);}
    else return "c"; // This is clear while 'm' is mine and 'x' is a no click.
    return "There is an error";} //REMOVE LATER
}// end of class
