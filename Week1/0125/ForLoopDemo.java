public class ForLoopDemo{
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("i is: " + i);
        }
        int j;
        for(j = 0; j < 5; j++){
            System.out.println("j is: " + j);
        }
        
        int k = 0;
        for(; k < 5; k++){
            System.out.println("k is: " + k);
        }
        
        int q = 0;
        for(; q < 5; ){
            System.out.println("q is: " + q);
            q++;
        }
    }
}