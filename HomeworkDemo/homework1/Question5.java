public class Question5{
  public static void main(String[] args){
    int[][] arr2D = {{3, 3, 5, 6, 9, 12, 12, 39, 40, 55}, 
                     {2, 1, 4, 6, 9, 11, 10, 43}};
    System.out.println("checkForValue 5 returns: " + checkForValue(arr2D, 5));
    // System.out.println("checkForValue 3 returns: " + checkForValue(arr2D, 3));
    // System.out.println("checkForValue 2 returns: " + checkForValue(arr2D, 2));
    // System.out.println("checkForValue 100 returns: " + checkForValue(arr2D, 100));
    // System.out.println("checkForValue -55 returns: " + checkForValue(arr2D, -55));
  }
  
  private static boolean checkForValue(int[][] arr, int searchVal){
    System.out.println("arr.length is: " + arr.length);
    System.out.println("arr[0].length is: " + arr[0].length);
    System.out.println("arr[1].length is: " + arr[1].length);
    for(int i = 0; i < arr.length; i++){
      
    }
    return true;
  } 
}