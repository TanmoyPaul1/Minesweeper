import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Board extends JFrame{

/*Logistics*/ 
  public Board(int rows, int columns){
  JFrame boar = new JFrame();
  boar.setTitle("Minesweeper");
  boar.setDefaultCloseOperation(EXIT_ON_CLOSE); // Closes when xed out
  boar.setSize(1200,1200);
  JPanel holder = new JPanel();
  
  holder.setLayout(new GridLayout(rows,columns,0,0));  // was 3,3,0,0
  
  
  boar.setVisible(true);
  boar.setResizable(true);//}// end of constructor when ADDmines is enabled
  
  //public void AddMines(int rows, int columns){ comented out
  Block[][] Bblock = new Block[rows][columns]; 
  
  
  for (int k=0; k<rows; k++){
  for (int i=0; i<columns; i++){
  
  Bblock[k][i] = new Block(); 
  
    holder.add(Bblock[k][i]);}} //check originaaly 

  
  boar.add(holder);}// end of ADDMines but is end of constructor
    

}//end of class