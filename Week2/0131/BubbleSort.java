public class BubbleSort{
    public static void main(String[] args){
        int[] arr = { 4, 2, 6, 22, 6, -1, 2, 55, 98, -122, 121, 11, 8, 3, 15, 30, 37, 38, 45, 47};
        
        boolean hasChanged = true;
        while(hasChanged == true){ // keep going if anything has been changed
            hasChanged = false;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    hasChanged = true;
                }
            }
        }
        printArray(arr);
    }
    
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}