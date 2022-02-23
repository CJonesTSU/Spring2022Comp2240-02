import java.util.Scanner;


public class ScannerReadInteger{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    String inputString = keyboard.nextLine();
    System.out.println("inputString is: " + inputString);
    int theInt = Integer.parseInt(inputString);
    System.out.println("theInt is: " + theInt);
  }
}