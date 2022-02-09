public class Question4{
  public static void main(String[] args){
    int[] inOrder1 = {};
    int[] inOrder2 = {9};
    int[] inOrder3 = {4, 89};
    int[] inOrder4 = {1, 3, 5};
    int[] inOrder5 = { 3, 3, 5, 6, 9, 12, 12, 39, 40, 55};
    int[] outOfOrder1 = {3, 2};
    int[] outOfOrder2 = {1, 5, 4}; 
    int[] outOfOrder3 = {2, 1, 4, 6, 9, 11, 10, 43, 51, 100};
  
    
    System.out.println("inOrder1 returned: " + isInOrder(inOrder1));
    System.out.println("inOrder2 returned: " + isInOrder(inOrder2));
    System.out.println("inOrder3 returned: " + isInOrder(inOrder3));
    System.out.println("inOrder4 returned: " + isInOrder(inOrder4));
    System.out.println("inOrder5 returned: " + isInOrder(inOrder5));
    
    System.out.println("outOfOrder1 returned: " + isInOrder(outOfOrder1));
    System.out.println("outOfOrder2 returned: " + isInOrder(outOfOrder2));
    System.out.println("outOfOrder3 returned: " + isInOrder(outOfOrder3));
  }
  
  private static boolean isInOrder(int[] arr){
    boolean inOrder = true;
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] > arr[i + 1]){
        inOrder = false;
      } 
    }
    return inOrder;
  }

  
  
  
}

