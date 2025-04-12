import java.util.Scanner;

public class EnhancedCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, result = 0.0;
        boolean continueCalculating = true;

        System.out.println("\n----------------------------");
        System.out.println("   Welcome to CalcX   ");
        System.out.println("----------------------------");

        while (continueCalculating) {
            System.out.print("\nEnter the first number: ");
            a = in.nextDouble();

            System.out.print("Enter the second number: ");
            b = in.nextDouble();

            System.out.println("\nChoose the operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (×)");
            System.out.println("4. Division (÷)");
            System.out.println("5. Power (a^b)");
            System.out.println("6. Square Root");
            System.out.println("7. Logarithm (base 10)");
            System.out.println("8. Factorial (for integer input)");

            System.out.print("\nPlease enter the operation number: ");
            int operation = in.nextInt();

            switch (operation) {
                case 1: // Addition
                    result = a + b;
                    System.out.printf("\n%.2f + %.2f = %.2f\n", a, b, result);
                    break;
                case 2: // Subtraction
                    result = a - b;
                    System.out.printf("\n%.2f - %.2f = %.2f\n", a, b, result);
                    break;
                case 3: // Multiplication
                    result = a * b;
                    System.out.printf("\n%.2f × %.2f = %.2f\n", a, b, result);
                    break;
                case 4: // Division
                    if (b != 0) {
                        result = a / b;
                        System.out.printf("\n%.2f ÷ %.2f = %.2f\n", a, b, result);
                    } else {
                        System.out.println("\nError: Cannot divide by zero!");
                    }
                    break;
                case 5: // Power
                    System.out.println("Choose which value to raise to the power: ");
                    System.out.println("1. Raise A to the power of B");
                    System.out.println("2. Raise B to the power of A");

                    int powerChoice = in.nextInt();
                    if (powerChoice == 1) {
                        result = Math.pow(a, b);
                        System.out.printf("\n%.2f ^ %.2f = %.2f\n", a, b, result);
                    } else if (powerChoice == 2) {
                        result = Math.pow(b, a);
                        System.out.printf("\n%.2f ^ %.2f = %.2f\n", b, a, result);
                    } else {
                        System.out.println("\nInvalid option for power operation.");
                    }
                    break;
                case 6: // Square Root
                    System.out.print("Choose which number to find the square root: ");
                    System.out.println("1. Square root of A");
                    System.out.println("2. Square root of B");

                    int rootChoice = in.nextInt();
                    if (rootChoice == 1) {
                        if (a < 0) {
                            System.out.println("\nError: Cannot calculate square root of negative number.");
                        } else {
                            result = Math.sqrt(a);
                            System.out.printf("\n√%.2f = %.2f\n", a, result);
                        }
                    } else if (rootChoice == 2) {
                        if (b < 0) {
                            System.out.println("\nError: Cannot calculate square root of negative number.");
                        } else {
                            result = Math.sqrt(b);
                            System.out.printf("\n√%.2f = %.2f\n", b, result);
                        }
                    } else {
                        System.out.println("\nInvalid option for square root operation.");
                    }
                    break;
                case 7: // Logarithm
                    System.out.println("Choose which number for log base 10: ");
                    System.out.println("1. Logarithm of A");
                    System.out.println("2. Logarithm of B");

                    int logChoice = in.nextInt();
                    if (logChoice == 1) {
                        if (a <= 0) {
                            System.out.println("\nError: Logarithm undefined for non-positive numbers.");
                        } else {
                            result = Math.log10(a);
                            System.out.printf("\nlog(%.2f) = %.2f\n", a, result);
                        }
                    } else if (logChoice == 2) {
                        if (b <= 0) {
                            System.out.println("\nError: Logarithm undefined for non-positive numbers.");
                        } else {
                            result = Math.log10(b);
                            System.out.printf("\nlog(%.2f) = %.2f\n", b, result);
                        }
                    } else {
                        System.out.println("\nInvalid option for logarithm operation.");
                    }
                    break;
                case 8: // Factorial
                    System.out.print("Enter a positive integer for factorial: ");
                    int num = in.nextInt();
                    if (num < 0) {
                        System.out.println("\nError: Factorial is not defined for negative numbers.");
                    } else {
                        result = 1;
                        for (int i = 1; i <= num; i++) {
                            result *= i;
                        }
                        System.out.printf("\nFactorial of %d = %.0f\n", num, result);
                    }
                    break;
                default:
                    System.out.println("\nInvalid operation! Please try again.");
                    break;
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String continueResponse = in.next();
            if (continueResponse.equalsIgnoreCase("no")) {
                continueCalculating = false;
                System.out.println("\nThanks for using CalcX 3000! Goodbye!");
            }
        }

        in.close();
    }
}
