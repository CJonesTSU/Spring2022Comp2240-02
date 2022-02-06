public class SelectionSort {
    public static void main(String[] args){
        int[] list = { 4, 2, 6, 22, 6, -1, 2, 55, 98, -122, 121, 11, 8, 3, 15, 30, 37, 38, 45, 47};
        int n = list.length;
        // print starting array
        System.out.println("Starting Array");
        printArray(list);
        
        
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(list[j] < list[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = list[min];
                    list[min] = list[i];
                    list[i] = temp;     
            }
            // print partially sorted array
            System.out.print("i is: " + i + " ");
            printArray(list);
        }
    }
    
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}