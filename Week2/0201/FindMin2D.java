public class FindMin2D{
    public static void main(String[] args){
        int[][] arr2D = {{19, 3, 4, 5}, 
                         {-17, 4, 5, 8},
                         {4, 1, 9, 15}};
        int minimum = findMin2D(arr2D);
        System.out.println("minimum is:" + minimum);
    }
    
    private static int findMin2D(int[][] arr){
        int min = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }    
            }
        }
        return min;
    }
}