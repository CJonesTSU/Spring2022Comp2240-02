import java.util.ArrayList;
import java.util.Scanner;

public class PersonArrayList3{
  public static void main(String[] args){
    // Person p1 = new Person("Chris", "Jones", "111-22-3333", 1978);
    // Person p2 = new Person("Bob", "Smith", "222-33-4444", 1999);
    // //System.out.println(p1.printPerson());
    ArrayList<Person> myPeople = new ArrayList<>();
    // myPeople.add(p1);
    // myPeople.add(p2);
    // printPeopleList(myPeople);
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter info on a person 'q' to quit");
    char check = 'y';

    do{
      System.out.print("Enter 'a'to add, 'p' to print or 'q' to quit: ");
      check = keyboard.next().charAt(0);

      switch (check){
        case 'a':
          myPeople.add(buildPerson(keyboard));
          break;
        case 'p':
          printPeopleList(myPeople);
          break;
        case 'q':
          break;
        default:
          System.out.println("Invalid choice, try again.\n\n");
      }
      // if(check == 'a'){
      //   Person temp = new Person();
      //   field = keyboard.nextLine();

      //   System.out.print("Enter first name: ");
      //   field = keyboard.nextLine();
      //   temp.setFirstName(field);
        
      //   System.out.print("Enter last name: ");
      //   field = keyboard.nextLine();
      //   temp.setLastName(field);
        
      //   System.out.print("Enter Social Security Number: ");
      //   field = keyboard.nextLine();
      //   temp.setSSN(field);
        
      //   System.out.print("Enter birth year: ");
      //   year = keyboard.nextInt();
      //   temp.setBirthYear(year);
        
      //   myPeople.add(temp);
      // }
      
      // if(check == 'p'){
      //   printPeopleList(myPeople);
      // }
    }while(check != 'q');
  }
  
  public static void printPeopleList(ArrayList<Person> arr){
    // for(int i = 0; i < arr.size(); i++){
    //   System.out.println(arr.get(i).printPerson());
    //   System.out.println();
    // }
    for(Person p : arr){
      System.out.println(p.printPerson());
      System.out.println();      
    }
  }
    public static Person buildPerson(Scanner keyboard){
      String field;
      int year;
      Person temp = new Person();
      field = keyboard.nextLine();
  
      System.out.print("Enter first name: ");
      field = keyboard.nextLine();
      temp.setFirstName(field);
      
      System.out.print("Enter last name: ");
      field = keyboard.nextLine();
      temp.setLastName(field);
      
      System.out.print("Enter Social Security Number: ");
      field = keyboard.nextLine();
      temp.setSSN(field);
      
      System.out.print("Enter birth year: ");
      year = keyboard.nextInt();
      temp.setBirthYear(year);
      
      return temp;
  }
}






