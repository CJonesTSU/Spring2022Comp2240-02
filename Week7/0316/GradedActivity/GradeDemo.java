import java.util.Scanner;
/**
   This program demonstrates the GradedActivity 
   class.
*/

public class GradeDemo{
   public static void main(String[] args){
      String input;        // To hold input
      double testScore;    // A test score
      
      // Create a GradedActivity object.
      GradedActivity grade = new GradedActivity();

      // Get a test score.
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a numeric test score. ");
      input = keyboard.nextLine();
      testScore = Double.parseDouble(input);
      // Integer.parseInt("34");

      // Store the score in the grade object.
      grade.setScore(testScore);
      
      // Display the letter grade for the score.
      System.out.println("The grade for that test is " + grade.getGrade());
   }
}