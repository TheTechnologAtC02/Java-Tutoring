import java.util.Arrays;

public class ArrayShifter {

    /*
     * A
     */

    static void main() {
        // The fixed input array
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // How many values do we have?
        int length = input.length;
        int maxIndex = length - 1;

        // Create result array with same length as input array
        int[] result = new int[length];

        // Iterate over every value of the input
        for (int i = 0; i < length; i++) {
            // "i" is the index of the value within the "input"-array
            // -> we now calculate what index that value should have in the "output"-array
            // -> since we want to reverse the order, we start inserting the values from the end of the array
            // -> the end of the array is the maxIndex minus 0, the second-to-last index will be maxIndex minus 1, etc.
            int indexInResult = maxIndex - i;

            // We just calculated where the value should be put -> now we put it there :)
            result[indexInResult] = input[i];
        }

        // Output
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(result));
    }
}
