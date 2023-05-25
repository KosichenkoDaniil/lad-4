public class CocktailShakerSort {

    public static int[] cocktailSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length;

        while (swapped == true) {
            // reset the swapped flag on entering the loop,
            // because it might be true from a previous iteration.
            swapped = false;

            // perform the first half of the sort (from left to right)
            for (int i = start; i < end - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // if no elements have been swapped,
            // then the list is sorted
            if (swapped == false)
                break;

            // otherwise, reset the swapped flag
            swapped = false;

            // move the end point back by one,
            // because the items after end are already sorted
            end = end - 1;

            // perform the second half of the sort (from right to left)
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // move the start point up by one,
            // because the items before start are already sorted
            start = start + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 3, 9, 4, 8, 7};
        cocktailSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}