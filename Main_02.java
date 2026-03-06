import java.util.Scanner; // Import the Scanner class for user input

public class Main_02 {

    // 1. THE ADD FUNCTION (METHOD) DEFINITION
    // public: Accessible from other classes
    // static: Can be called without creating an object of the class
    // int: The function will return an integer result
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2; // The logic
        return sum;            // Sending the result back to the caller
    }

    // 2. THE MAIN METHOD (Execution starts here)
    public static void main(String[] args) {
        // Initialize Scanner for input
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Java Addition Program ---");

        // Taking Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // 3. CALLING THE FUNCTION
        // We pass 'a' and 'b' as arguments to 'addNumbers'
        int result = addNumbers(a, b);

        // Displaying the result
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
        
        sc.close(); // Good practice to close the scanner
    }
}


