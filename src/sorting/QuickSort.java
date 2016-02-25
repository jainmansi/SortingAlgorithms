/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Muddassar
 */
public class QuickSort implements ISortStrategy {
    
    int result[];

    @Override
    public int[] sort(int[] input) {
        System.out.println("Performing Quick Sort");
        int left;
        int right;
        // copying the input array to the result        
        result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        left = 0;
        right = result.length - 1;
        quickSortArray(left, right);
        return result;
    }
    
    private void quickSortArray(int left, int right) {
        if (left >= right) {
            return;
        }
        // For the simplicity, we took the right most item of the array as a pivot 
        int pivot = result[right];
        int partition = partition(left, right, pivot);
        // Recursively, calls the quicksort with the different left and right parameters of the sub-array
        quickSortArray(0, partition - 1);
        quickSortArray(partition + 1, right);
    }
    private int partition(int left, int right, int pivot) {
        int leftCursor = left - 1;
        int rightCursor = right;
        while (leftCursor < rightCursor) {
            while (result[++leftCursor] < pivot);
            while (rightCursor > 0 && result[--rightCursor] > pivot);
            if (leftCursor >= rightCursor) {
                break;
            } else {
                swap(leftCursor, rightCursor);
            }
        }
        swap(leftCursor, right);
        return leftCursor;
    }
    public void swap(int left, int right) {
        int temp = result[left];
        result[left] = result[right];
        result[right] = temp;
    }
    
}
