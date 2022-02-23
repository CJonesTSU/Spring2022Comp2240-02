import java.util.Random;
public class Die{

    int sides;

    Random rand = new Random();

    // Constructors
    public Die(){
        sides = 0;
    }

    public Die(int s){
        sides = s;
    }

    // getters and accessors
    public int getSides(){
        return sides;
    }

    // setter or mutator
    public void setSide(int s){
        sides = s;
    }

    public int getVal(){
        return  rand.nextInt(sides) + 1;
    }
} 