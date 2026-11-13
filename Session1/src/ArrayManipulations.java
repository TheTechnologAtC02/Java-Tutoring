import java.util.Arrays;

public class ArrayManipulations {

    static void main() {
        // The fixed input array
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Input:");
        System.out.println(Arrays.toString(input));

        System.out.println("Array Inverter:");
        invertArray(input);

        System.out.println("Array Shifter:");
        shiftArray(input);

        System.out.println("Array Shifter with custom shift:");
        shiftArrayBy(input, 2);

        System.out.println("Array Shifter with negative shift:");
        shiftArrayByWithNegative(input, -2);
    }

    private static void invertArray(int[] input) {
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
        System.out.println(Arrays.toString(result));
    }

    private static void shiftArray(int[] input) {
        // How many values do we have?
        int length = input.length;

        // Create result array with same length as input array
        int[] result = new int[length];

        // Iterate over every value of the input
        for (int i = 0; i < length; i++) {
            // "i" is the index of the value within the "input"-array
            // -> we want to shift the index one to the right, so we add 1
            // -> but wait! we also must ensure that the index never exceeds the maximum index!
            // -> since the maximum index is 1 less than the length, we would exceed it as soon as we reach exactly "length"
            // -> so we simply modulo length -> this resets the index to 0 at the moment "length" is reached
            int indexInResult = (i + 1) % length;

            // We just calculated where the value should be put -> now we put it there :)
            result[indexInResult] = input[i];
        }

        // Output
        System.out.println(Arrays.toString(result));
    }

    private static void shiftArrayBy(int[] input, int shift) {
        int length = input.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int indexInResult = (i + shift) % length;
            result[indexInResult] = input[i];
        }
        System.out.println(Arrays.toString(result));
    }

    private static void shiftArrayByWithNegative(int[] input, int shift) {
        if (shift >= 0) {
            shiftArrayBy(input, shift);
            return;
        }
        int length = input.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int indexInResult = (i + shift % length) % length;
            if (indexInResult < 0) {
                indexInResult = length - 1;
            }
            result[indexInResult] = input[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
