import java.util.Scanner;

public class Factorial {

    // recursive Method
    static int factorialOfNumber(int num){
        // ternary operator
        return num > 1 ? num * factorialOfNumber(num-1):num;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char choice;
        do{
            System.out.print("............\nEnter Number : ");
            int number = input.nextInt();

            System.out.print("Factorial of "+number+" = "+factorialOfNumber(number));

            System.out.print("\n............\nWant to quite = ");
            choice= input.next().charAt(0);
        }while (choice=='n');

    }
}
