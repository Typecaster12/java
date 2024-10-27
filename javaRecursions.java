import java.util.Scanner;

public class recursion {
    //function calling itself is recursion;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }



    // Function to compute the nth Fibonacci number using recursion
    //formula => F(n)=F(n−1)+F(n−2)


    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Number of terms in the Fibonacci series
        int n = 4;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the Fibonacci series up to n terms
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }




    // Recursive method to print numbers from start to end
    public static void printNumbers(int start, int end) {
        // Base case: If start exceeds end, stop the recursion
        if (start > end) {
            return; // Exit the method if start is greater than end
        }

        // Print the current number
        System.out.print(start + " ");

        // Recursive call to print the next number
        printNumbers(start + 1, end);
    }

    public static void main(String[] args) {
        // Define the range
        int start = 1; // Starting number
        int end = 10;  // Ending number

        // Print the series
        System.out.println("Series of numbers from " + start + " to " + end + ":");
        printNumbers(start, end);
    }
}
