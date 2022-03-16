import java.io.*;
import java.util.Scanner;


public class FileWriter{
  public static void main(String[] args) throws FileNotFoundException{
    PrintWriter pw = new PrintWriter("Test.txt");
    pw.println("Chris");
    pw.println("Desmond");
    pw.println("Collin");
    pw.println("Jay");
    pw.close();
    
    // read our data back in from the file
    
    System.out.println("Showing content of file first time");
    File myFile = new File("Test.txt");
    Scanner myScanner = new Scanner(myFile);
    while(myScanner.hasNext()){
      String line = myScanner.nextLine();
      System.out.println(line);
    }
    
    PrintWriter pw2 = new PrintWriter("Test.txt");
    pw2.println("Peyton");
    pw2.println("Mpingo");
    pw2.println("Taurus");
    pw2.println("Jamari");
    pw2.close();
    
    
    System.out.println("Showing content of file second time");
    File myFile2 = new File("Test.txt");
    Scanner myScanner2 = new Scanner(myFile);
    while(myScanner2.hasNext()){
      String line = myScanner2.nextLine();
      System.out.println(line);
    }
    
  }
}