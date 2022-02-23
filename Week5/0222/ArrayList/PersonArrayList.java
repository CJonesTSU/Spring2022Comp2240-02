import java.util.ArrayList;

public class PersonArrayList{
  public static void main(String[] args){
    Person p1 = new Person("Chris", "Jones", "111-22-3333", 1978);
    Person p2 = new Person("Bob", "Smith", "222-33-4444", 1999);
    //System.out.println(p1.printPerson());
    ArrayList<Person> myPeople = new ArrayList<>();
    myPeople.add(p1);
    myPeople.add(p2);
    printPeopleList(myPeople);
    

    
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
}






