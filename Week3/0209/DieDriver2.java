public class DieDriver2{
    public static void main(String[] args){
        Die die1 = new Die();
        Die die2 = new Die(6);
        rollDie(die2, 10);
        System.out.println("The number of sides " + die2.getSides());
    }

    public static void rollDie(Die d, int n){
        for(int i = 0; i < n; i++){
            System.out.println(d.getVal());
        }
        d.setSide(25);
    }
}