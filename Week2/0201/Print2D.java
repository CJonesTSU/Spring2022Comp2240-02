public class Print2D{
    public static void main(String[] args){
        int rows = 2;
        int cols = 4;
        int[][] arr2D = new int[rows][cols];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;
        arr2D[0][3] = 4;
        // number of rows is arr2D.length
        // number of columns is arr2D[0].length
        
        arr2D[1][0] = 5;
        arr2D[1][1] = 6;
        arr2D[1][2] = 7;
        arr2D[1][3] = 8;
        
        System.out.println("arr2D");
        print2DArray(arr2D);
        
        int[][] otherArr2D = {{2, 3, 4, 5}, 
                              {17, 4, 5, 8},
                              {4, 8, 9, 15}};
        // otherArr2D[0] is {2,3,4,5}
        // otherArr2D[1] is {17, 4, 5,8}
        // number of rows is otherArr2D.length
        // number of columns is otherArr2D[0].length 
        System.out.println("otherArr2D");
        print2DArray(otherArr2D);
    }
    
    public static void print2DArray(int[][] arr2D){
        for(int row = 0; row < arr2D.length ; row++){ // this loops through rows
            for(int col = 0; col < arr2D[0].length; col++){ // this loops through columns
                System.out.print(arr2D[row][col] + " ");    
            }
            System.out.println();
        }
    }
}