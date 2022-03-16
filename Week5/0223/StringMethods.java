public class StringMethods{
  public static void main(String[] args){
    String testString = "This is a string that we will use for testing";
    if(testString.startsWith("This is a strING")){
      System.out.println("The test string starts with 'This is a strING'");
    }else{
      System.out.println("The test string doesn't start with 'This is a strING'");
    }
    
    if(testString.endsWith("testing")){
      System.out.println("The test string ends with 'testing'");
    }else{
      System.out.println("The test string doesn't end with 'testing'");
    }
    
    System.out.println("The index of 'is' in text string is: " + testString.indexOf("is"));
    System.out.println("The last index of 'is' in text string is: " + testString.lastIndexOf("is"));
    System.out.println("The index of 'Gazelle' in text string is: " + testString.indexOf("Gazelle"));
    System.out.println("The index of 'i' in text string is: " + testString.indexOf("i"));
    
    int index = testString.indexOf("i");
    while(index != -1){
      System.out.println("found an 'i' at index: " + index);
      index = testString.indexOf("i", index + 1);
    }
    
    String fullName = "Cynthia Susan Smith";
    String lastName = fullName.substring(14);
    System.out.println("Last name is: " + lastName);
    char[] letters = fullName.toCharArray();
    for(char c : letters){
      System.out.println("character is: " + c);
    }
    String[] words = fullName.split(" ");
    for(String s : words){
      System.out.println("The word is: " + s);
    }
    
    String newTest = testString.replace("i", "@");
    System.out.println("newTest is: " + newTest);
    String extraSpaces = "          This is my name                   ";
    
    System.out.println(extraSpaces);
    System.out.println(extraSpaces.trim());
    
    
    
    
    
    
    
    
    
    
    
  }
}