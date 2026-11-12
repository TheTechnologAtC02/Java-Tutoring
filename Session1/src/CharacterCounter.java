public class CharacterCounter {
    static void main() {
        // Our fixed input
        String[] input = {"h", "e", "l", "l", "o"};

        // An array of all characters that the logic can understand
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        // The counters that will hold our result
        int[] counters = new int[alphabet.length];

        // Find the index of the character in our alphabet and increment the corresponding counter
        for (int i = 0; i < input.length; i++) {
            int indexInAlphabet = findIndexInAlphabet(alphabet, input[i]);
            counters[indexInAlphabet]++;
        }

        // Let's create a nice and readable output!
        String output = "";

        // We iterate over all counters...
        for (int i = 0; i < counters.length; i++) {
            // ... read the value of the current counter ...
            int current = counters[i];
            // ... skip it if it's equal to 0 (which means that the character never appeared in the input) ...
            if (current == 0) {
                continue;
            }
            // ... and append the value of the current counter + the corresponding character to the output.
            output += current + alphabet[i] + " ";
        }
        System.out.println(output);
    }

    private static int findIndexInAlphabet(String[] alphabet, String input) {
        // We iterate over the whole alphabet and call .equals on each element.
        // When .equals returns true, then we have found the element that we are searching for.
        // Then, we return the index (=i) of the current iteration.
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(input)) {
                return i;
            }
        }

        // We expect that we always find a match, but the compiler forces us to define a "default" return value.
        // -1 is a customary return value for "search-like" methods in the case that they want to report "did not find"
        return -1;
    }
}
