import java.util.ArrayList;

public class ArrayListExample{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<>();
    
    System.out.println("names.size: " + names.size());
    names.add("Comedian");
    names.add("Bob");
    names.add("Frank");
    System.out.println("names.size: " + names.size());
    
    System.out.println("First name in list is: " + names.get(0));
    
    for(int i = 0; i < names.size(); i++){
      System.out.println("names.get(" + i +") returns: " + names.get(i));
    }
    
    // enhanced for loop
    for(String s : names){
      System.out.println(s);
    }
    
    System.out.println(names);
    System.out.println("Removed bob from location 1");
    names.remove(1);
    
      // enhanced for loop
    for(String s : names){
      System.out.println(s);
    }
    
    names.add(1, "Harry");
    System.out.println("added harry at location 1");
    // enhanced for loop
    for(String s : names){
      System.out.println(s);
    }
    
    System.out.println("added george at end and Mary at beginning");
    names.add("George");
    names.add(0, "Mary");
     // enhanced for loop
    for(String s : names){
      System.out.println(s);
    }   
    System.out.println("Replacing Harry with Betty");
    names.set(2, "Betty");
     // enhanced for loop
    for(String s : names){
      System.out.println(s);
    }  
    
    
    
  }
}