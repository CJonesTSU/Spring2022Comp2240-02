public class PrintArray2 {
    public static void main(String[] args){
        int[] arr = {14, 32, 78, 64};
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        for(int i = 0; i < arr.length; i++){
            System.out.println("i: " + i + " " + arr[i] );
        }
    }
}