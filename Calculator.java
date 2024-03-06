import java.util.Scanner;

class Calculator{
    public static void main(String args[]) {
        String operator;
        float num1, num2, output;
        double ans;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number (if root enter same number twice): ");
        num1 = input.nextFloat();
        System.out.println("Enter your second number: ");
        num2 = input.nextFloat();
        System.out.println("Enter your operator (+,-,*,/,^,sqrt): ");
        operator = input.next();

        switch(operator){
            case "*":
                output = num1 * num2;
                System.out.println("The answer is: " + output);
            break;

            case "/":
                output = num1 / num2;
                System.out.println("The answer is: " + output);
            break;

            case "+":
                output = num1 + num2;
                System.out.println("The answer is: " + output);
            break;

            case "-":
                output = num1 - num2;
                System.out.println("The answer is: " + output);
            break;

            case "^":
                ans = Math.pow(num1, num2);
                System.out.println("The answer is: " + ans);
            break;

            case "square root":
            case "root":
            case "sqrt":
                ans = Math.sqrt(num1);
                System.out.println("The answer is: " + ans);
            break;

        }
        input.close();
    }
}
