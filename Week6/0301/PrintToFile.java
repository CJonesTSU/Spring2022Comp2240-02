import java.io.*;

public class PrintToFile{
  public static void main(String[] args) throws FileNotFoundException{
    PrintWriter pw = new PrintWriter("myFile.txt");
    pw.print("Chris ");
    pw.println("was here");
    pw.println("This is COMP 2240 Section 2");
    for(int i = 0; i < 1000; i++){
      pw.println("This is line: " + i);
    }
    pw.close();
    
  }
}