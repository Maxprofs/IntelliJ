import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me the first # you want to multiply");
        num1 = keyboard.nextDouble();
        System.out.println("Give me the second # you want to multiply");
        num2 = keyboard.nextDouble();
        Compute multiplation = new Compute(num1,num2);
        System.out.println(multiplation);
    }
}
