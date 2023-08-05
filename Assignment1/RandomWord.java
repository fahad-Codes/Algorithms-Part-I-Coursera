import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        String champion = "";
        int i = 0;

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            i++;

            // Select the current word as the champion with probability 1/i
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }
        }

        // Print the surviving champion
        StdOut.println(champion);
    }
}
