import java.util.Scanner;

class calculator {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }
}

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator obj = new Calculator();

        System.out.println("Addition = " + obj.addition(a, b));
        System.out.println("Subtraction = " + obj.subtraction(a, b));
        System.out.println("Multiplication = " + obj.multiplication(a, b));
        System.out.println("Division = " + obj.division(a, b));
    }
}
