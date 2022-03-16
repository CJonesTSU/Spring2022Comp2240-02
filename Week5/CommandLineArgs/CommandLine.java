/**
   This program displays the arguments passed to
   it from the operating system command line.
*/

public class CommandLine{
   public static void main(String[] args){
    System.out.println("Begining to print command line arguments");
    for (int index = 0; index < args.length; index++)
     System.out.println(args[index]);
     
    System.out.println("Finished printing command line arguments");
  }
}