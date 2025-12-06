package h07;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        PeanoNumber Zero = new PeanoNumber();
        PeanoNumber One = new PeanoNumber(Zero);
        PeanoNumber Two = new PeanoNumber(One);
        System.out.println(Two.toString());
        PeanoNumber Three = new PeanoNumber(Two);
        System.out.println(Three.toString());
        PeanoNumber four = Two.multiplyIterative(One);
        System.out.println(four.asIntRecursive());
        System.out.println(PalindromeChecker.isPalindromeRecursive(new int[]{1,2,2,1}));
        System.out.println(PalindromeChecker.isPalindromeIterative(new int[]{1,2,2,1}));
        System.out.println(PalindromeChecker.isPalindromeRecursive(new int[]{1,2,3,2,1}));
        System.out.println(PalindromeChecker.isPalindromeIterative(new int[]{1,2,3,2,1}));
        System.out.println(PalindromeChecker.isPalindromeRecursive(new int[]{1,3,2,1}));
        System.out.println(PalindromeChecker.isPalindromeIterative(new int[]{1,3,2,1}));
}
}
