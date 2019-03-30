import java.util.Scanner;
public class Handeler{

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows you want, if you choose anything less than 5, you will get 5 as your number of rows, try not to overload: ");
    int rows = sc.nextInt();
    if (rows<5){rows =5;}//w
  System.out.println("Enter the number of columns you want, if you choose anything less than 5, you will get 5 as your number of columns, try not to overload: ");
    int columns = sc.nextInt();
    if (columns<5){columns = 5;}//w
    
    Board MineBoard = new Board(rows,columns);
    System.out.println("Loading game...");
  
  }
}