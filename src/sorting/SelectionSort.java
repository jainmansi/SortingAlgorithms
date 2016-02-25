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
public class SelectionSort implements ISortStrategy {

    @Override
    public int[] sort(int[] input) {
        System.out.println("Performing Selection Sort");
        for (int i = 0; i < input.length - 1; i++) {
            int MIN = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[MIN] > input[j]) {
                    MIN = j;
                }
            }
            if (MIN != i) { // 
                int temp = input[MIN];
                input[MIN] = input[i];
                input[i] = temp;
            }
        }
        return input;
    }

}
