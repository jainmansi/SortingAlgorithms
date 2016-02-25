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
public class InsertionSort implements ISortStrategy {

    @Override
    public int[] sort(int[] input) {
        System.out.println("Performing Insertion Sort");
        int A[] = input;
         for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j-1;
            while ( (i > -1) && ( A[i] > key ) ) {
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
           
        }
//        for (int p : array){
//            System.out.println(p);
//        }
        return A;
    
    }
    
}
