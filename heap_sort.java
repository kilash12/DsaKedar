public class heap_sort {
    // Main function to do heap sort
    public void heapSort(int[] A) {
        buildMaxHeap(A);  // Step 1: Build a max heap

        int heapSize = A.length;

        // One by one extract elements from the heap
        for (int i = heapSize - 1; i >= 1; i--) {
            // Swap the root (largest) with the last element in the heap
            swap(A, 0, i);
            heapSize--;  // Reduce the heap size
            maxHeapify(A, 0, heapSize);  // Restore the heap property
        }
    }

    // Function to build the max heap
    private void buildMaxHeap(int[] A) {
        int heapSize = A.length;

        // Start from the last non-leaf node and heapify each node
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            maxHeapify(A, i, heapSize);
        }
    }

    // Function to maintain the max heap property
    private void maxHeapify(int[] A, int i, int heapSize) {
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2;  // Right child index
        int largest = i;  // Assume the current node is the largest

        // Compare the left child with the root
        if (left < heapSize && A[left] > A[largest]) {
            largest = left;
        }

        // Compare the right child with the largest value so far
        if (right < heapSize && A[right] > A[largest]) {
            largest = right;
        }

        // If the largest is not the root, swap and continue heapifying
        if (largest != i) {
            swap(A, i, largest);
            maxHeapify(A, largest, heapSize);  // Recursively heapify the affected subtree
        }
    }

    // Utility function to swap two elements in the array
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Testing the algorithm
    public static void main(String[] args) {
        heap_sort sorter = new heap_sort();
        int[] array = {12, 11, 13, 5, 6, 7,1,2,3,4,5,54,65,67,465,657,654654};
        sorter.heapSort(array);

        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
