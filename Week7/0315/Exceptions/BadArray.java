/**
   This program causes an error and crashes.
*/

public class BadArray{
   public static void main(String[] args)   {
      // Create an array with 3 elements.
      int[] numbers = { 11, 22, 33 };

      // Attempt to read beyond the bounds
      // of the array.
      try{
        printArray(numbers);
        // for (int i = 0; i <= 3; i++)
        //   System.out.println(numbers[i]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Got an index out of bound exception");
          System.out.println("exception message is: " + e.getMessage());
          StackTraceElement[] t = e.getStackTrace();
          for(int i = 0; i < t.length; i++){
            System.out.println("Stack Track: " + t[i]);
          }
      }
      catch (Exception e){
          //System.out.println("Unexpected condtion occurred, halting");  
          System.out.println("exception message is: " + e.getMessage());
          System.out.println("Stack Trace:" + e.getStackTrace());
      }
      
      finally{
        System.out.println("In finally clause");
      }
   }
   
   public static void printArray(int[] arr){
    for (int i = 0; i <= 3; i++)
      System.out.println(arr[i]);
   }
}