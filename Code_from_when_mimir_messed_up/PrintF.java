public class PrintF {
    public static void main(String[] args){
        String name = "Chris Jones";
        double money = 75.62552857841655565;
        int age = 27;
        
        System.out.println("My name is: " + name + " I have $" + money + " in my pocket and I am " + age +" years old.");
        System.out.printf("My name is: %s I have $%.2f in my pocket and I am %d years old.", name, money, age);
    }
}
