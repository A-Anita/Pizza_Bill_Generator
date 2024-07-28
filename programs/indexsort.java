public class indexsort {
    private int[] array;
    private int[] indexArray;
    private int minValue;
    private int maxValue;

    public indexsort(int[] array) {
        this.array = array;
        calculateRange();
        this.indexArray = new int[maxValue - minValue + 1];
    }

    private void calculateRange() {
        minValue = array[0];
        maxValue = array[0];
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }
    }

    public void sort() {
        // Step 1: Count occurrences of each element
        for (int num : array) {
            indexArray[num - minValue]++;
        }

        // Step 2: Accumulate counts
        for (int i = 1; i < indexArray.length; i++) {
            indexArray[i] += indexArray[i - 1];
        }

        // Step 3: Build the sorted array
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int num = array[i];
            sortedArray[indexArray[num - minValue] - 1] = num;
            indexArray[num - minValue]--;
        }

        // Copy sorted array back to original array
        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1, 9, 3, 7};
        indexsort sorter = new indexsort(array);

        System.out.println("Original Array:");
        sorter.printArray();

        sorter.sort();

        System.out.println("Sorted Array:");
        sorter.printArray();
    }
}
