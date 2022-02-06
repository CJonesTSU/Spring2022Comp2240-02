public class ArraySum {
    public static void main(String[] args){
        int[] arr = { 2, 4, -1, 16, 23, -5};
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            // sum = sum + arr[i];
            // shortcut version of this assignment is below
            sum += arr[i];
            System.out.println("i is: " + i);
            System.out.println("arr[" + i + "] is: " + arr[i]);
            System.out.println("current sum is: " + sum);
            System.out.println();
        }
        
        System.out.println("Sum is: " + sum);
    }
}