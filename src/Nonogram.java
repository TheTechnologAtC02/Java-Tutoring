public class Nonogram {
    public static void main(String[] args) {
        String[] input = {"a", "b", "c"};

        String result = caesar(input, 1);

        System.out.println(result);
    }

    private static String caesar(String[] input, int shift) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            String currentCharacter = input[i];
            int indexInAlphabet = findIndexInAlphabet(alphabet, currentCharacter);
            int shiftedIndexInAlphabet = (indexInAlphabet + shift) % alphabet.length;
            output[i] = alphabet[shiftedIndexInAlphabet];
        }

        return String.join("", output);
    }

    private static int findIndexInAlphabet(String[] alphabet, String input) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }
}
