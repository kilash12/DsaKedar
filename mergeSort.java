
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 2, 6, 4, 8, 9, 3};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr)); // Output sorted array
    }

    static void mergeSort(int arr[], int s, int e) {
        if (e - s <= 1) { // Base case correction
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        merge(arr, s, mid, e);
    }

    private static void merge(int arr[], int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s, j = mid, k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i]; // Fixed incorrect assignment
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j]; // Fixed incorrect assignment
            j++;
            k++;
        }

        // Copy back the sorted elements into the original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l]; // Fixed incorrect array reference
        }
    }
}
