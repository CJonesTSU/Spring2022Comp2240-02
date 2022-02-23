public class WrapperClasses{
  public static void main(String[] args){
    char myChar = 't';
    System.out.println("myChar is: " + myChar);
    System.out.println("myChar isLetter() returns: " + Character.isLetter(myChar));
    System.out.println("myChar isDigit() returns: " + Character.isDigit(myChar));
  }
}