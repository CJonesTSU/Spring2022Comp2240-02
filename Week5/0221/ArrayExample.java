public class ArrayExample{
  public static void main(String[] args){
    int[] myArray = new int[4];
    myArray[0] = 154;
    myArray[1] = 2;
    myArray[2] = 71;
    myArray[3] = 78;
    
    int[] myNewArray = new int[myArray.length * 2];
    for(int i = 0; i < myArray.length; i++){
      myNewArray[i] = myArray[i];
    }
    
    myArray = myNewArray;
   }
   
   
}