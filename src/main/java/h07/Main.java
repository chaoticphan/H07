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
        PeanoNumber four = Three.addRecursive(Three);
        System.out.println(four.asIntIterative());
    }
}
