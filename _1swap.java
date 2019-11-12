import java.util.Scanner;

public class firstswap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1  = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping : "+ " num1 = "+ num1 + "num2 = "+ num2);
    }
}
