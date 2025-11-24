package h07;

import org.tudalgo.algoutils.student.Student;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

public class PalindromeChecker {

    /**
     * Recursively checks if an array is a palindrome by calling a helper function.
     * @param arr the array to check
     * @return true if the array is a palindrome, false otherwise
     */
    @StudentImplementationRequired("H7.2.1")
    public static boolean isPalindromeRecursive(int[] arr) {
        return Student.crash(); //TODO: H7.2.1 - remove if implemented
    }

    /**
     * Iteratively checks if an array is a palindrome.
     * @param arr the array to check
     * @return true if the array is a palindrome, false otherwise
     */
    @StudentImplementationRequired("H7.2.2")
    public static boolean isPalindromeIterative(int[] arr) {
        return Student.crash(); //TODO: H7.2.2 - remove if implemented
    }

    @DoNotTouch
    public static int[] toDigits(int number) {
        int[] digits = new int[(int) Math.log10(number) + 1];
        int index = digits.length - 1;
        while (index >= 0) {
            digits[index] = Math.floorMod(number, 10);
            number /= 10;
            index -= 1;
        }
        return digits;
    }
}
