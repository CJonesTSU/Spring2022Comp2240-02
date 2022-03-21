import java.util.Scanner;

/**
   This program demonstrates the FinalExam class,
   which extends the GradedActivity class.
*/

public class FinalExamDemo
{
   public static void main(String[] args)
   {
      String input;     // To hold input
      int questions;    // Number of questions
      int missed;       // Number of questions missed
      Scanner keyboard = new Scanner(System.in);

      // Get the number of questions on the exam.
      System.out.print("How many questions are on the final exam? ");
      input = keyboard.nextLine();
      questions = Integer.parseInt(input);

      // Get the number of questions the student missed.
      System.out.print("How many questions did the student miss? ");
      input = keyboard.nextLine();
      missed = Integer.parseInt(input);

      // Create a FinalExam object.
      FinalExam exam = new FinalExam(questions, missed);

      // Display the test results.
      System.out.println("Each question counts " + exam.getPointsEach() +
           " points.\nThe exam score is " + exam.getScore() + "\nThe exam grade is " +
           exam.getGrade());
   }
}
