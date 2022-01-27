public class FindMin{
    public static void main(String[] args){
        int[] numArray = {99, 41, 51, 125, 656, 897, -98711};
        int currentMin = Integer.MAX_VALUE;
        System.out.println(currentMin);
        
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] < currentMin){
                currentMin = numArray[i];
            }
        }
        System.out.println("Minimum is: " + currentMin);
    }
}