public class Question5Demo{
  public static void main(String[] args){
    int[][] arr2D = {{3, 3, 5, 6, 9, 12, 12, 39, 40, 55}, 
                     {2, 1, 4, 6, 9, 11, 10, 43, 51, 100}};
    System.out.println("checkForValue 5 returns: " + checkForValue(arr2D, 5));
    System.out.println("checkForValue 3 returns: " + checkForValue(arr2D, 3));
    System.out.println("checkForValue 2 returns: " + checkForValue(arr2D, 2));
    System.out.println("checkForValue 100 returns: " + checkForValue(arr2D, 100));
    System.out.println("checkForValue -55 returns: " + checkForValue(arr2D, -55));
  }
  
  private static boolean checkForValue(int[][] arr, int searchVal){
    int min = arr[0][0];
    boolean found = false;
    for(int row = 0; row < arr.length; row++){
        for(int col = 0; col < arr[0].length; col++){
            System.out.println("Checking to see if " + arr[row][col] + " is equal to " + searchVal);
            // if(arr[row][col] < min){
            //     min = arr[row][col];
            // }    
        }
    }
    return found;
  } 
}
