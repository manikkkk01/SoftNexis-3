/*
 * EvenOddChecker.java
 * -------------------
 * Purpose: Determine if a number is Even or Odd
 * Author: Manik Kaushik
 * Date: 14-08-25
 *
 * Features:
 *  1. Static value check
 *  2. User input check (with validation)
 *  3. Uses ternary operator for concise decision-making
 */

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        // --- 1. Static value version ---
        int staticNumber = 27; 
        checkAndPrint(staticNumber); // Expected: "27 is Odd"
        
        // --- 2. Interactive version ---
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer: ");

        // Input validation to prevent errors
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Integers only!");
        } else {
            int userNumber = scanner.nextInt();
            checkAndPrint(userNumber);
        }

        scanner.close();
    }

    /**
     * Checks if a number is even or odd and prints the result.
     * Uses ternary operator for concise code.
     *
     * @param number The integer to check.
     */
    private static void checkAndPrint(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.printf("%d is %s\n", number, result);
    }
}
