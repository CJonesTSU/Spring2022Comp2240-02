import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadFile{
  public static void main(String[] args) throws FileNotFoundException{
    ArrayList<String[]> fileContent = new ArrayList<>();
    File myFile = new File("ProteinDataShort.csv");
    Scanner diskReader = new Scanner(myFile);
    while(diskReader.hasNext()){
      String myString = diskReader.nextLine();
      //System.out.println(myString + "\n\n");
      String[] words = myString.split(",");
      fileContent.add(words);
    }
    System.out.println("fileContent.size():" + fileContent.size() );
    for(int i = 0; i < fileContent.size(); i++){
      for(int j = 0; j < fileContent.get(i).length; j++){
        System.out.print(fileContent.get(i)[j] + " ");
      }
      System.out.println("\n\n");
    }
  }
}