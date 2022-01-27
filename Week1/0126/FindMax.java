public class FindMax{
    public static void main(String[] args){
        int[] numArray = {99, 41, 51, 125, 656, 897, -98711};
        int currentMax = Integer.MIN_VALUE;
        System.out.println(currentMax);
        
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] > currentMax){
                currentMax = numArray[i];
            }
        }
        System.out.println("Maximum is: " + currentMax);
    }
}