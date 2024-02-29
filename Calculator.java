import java.util.Scanner;

class Calculator{
    public static void main(String args[]) {
        char operator;
        float num1, num2, output;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        num1 = input.nextFloat();
        System.out.println("Enter your second number: ");
        num2 = input.nextFloat();
        System.out.println("Enter your operator: ");
        operator = input.next().charAt(0);

        switch(operator){
            case '*':
                output = num1 * num2;
                System.out.println("The answer is: " + output);
            break;

            case '/':
                output = num1 / num2;
                System.out.println("The answer is: " + output);
            break;

            case '+':
                output = num1 + num2;
                System.out.println("The answer is: " + output);
            break;

            case '-':
                output = num1 - num2;
                System.out.println("The answer is: " + output);
            break;

            case '^':
                double ans = Math.pow(num1, num2);
                System.out.println("The answer is: " + ans);
            break;

        }
        input.close();
    }
}
