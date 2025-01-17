
    import java.util.Scanner;

    public class substraction {
        public static void main(String[] args) {
            // Create a Scanner object to take user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter three numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            // Subtract the numbers
            int result = num1 - num2 - num3;

            // Display the result
            System.out.println("The result of subtracting the numbers is: " + result);

            // Close the scanner
            scanner.close();
        }
    }


