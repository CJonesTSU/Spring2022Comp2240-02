public class FindMax2{
    public static void main(String[] args){
        int[] numArray = {99, 41, 51, 125, 656, 897, -98711};
        int currentMax = numArray[0];
        
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] > currentMax){
                currentMax = numArray[i];
            }
        }
        System.out.println("Maximum is: " + currentMax);
    }
}