/**
   This program causes an error and crashes.
*/

public class BadArray
{
   public static void main(String[] args)
   {
      // Create an array with 3 elements.
      int[] numbers = { 11, 22, 33 };

      // Attempt to read beyond the bounds
      // of the array.
      try{
        for (int i = 0; i <= 3; i++)
          System.out.println(numbers[i]);
      } 
      catch (Exception ex){
          System.out.println("Unexpected condtion occurred, halting");  
          System.out.println("exception message is: " + ex.getMessage());
          System.out.println("Stack Trace:" + ex.getStackTrace());
      }
      finally{
        System.out.println("In finally clause");
      }
   }
}