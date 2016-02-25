/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import sorting.ISortStrategy;
import sorting.InsertionSort;
import sorting.QuickSort;
import sorting.SelectionSort;

/**
 *
 * @author Muddassar
 */
public class Solution {
    
    int counter = 0;
    
    public void solve()
    {
        IScanner scanner = ScannerFactory.getScanner(EnumInputType.File);
        
        while(scanner.hasNext())
        {
            //Read inputs && Write logic to convert input to required format
            //Input format : input array of integers|output array of integers
            String st = scanner.next();
            String[] dataLine = st.split("\\|");
            String[] input = dataLine[0].split(",");
            String[] output = dataLine[1].split(",");
            
            int[] inputData = convertStringArraytoIntArray(input);
            int[] outputData = convertStringArraytoIntArray(output);
            
            //Call sorting algorithms
            
            ISortStrategy[] arr = new ISortStrategy[3];
            
            long t1 = System.nanoTime();
            arr[0] = new SelectionSort();
            long t2 = System.nanoTime();
            
            long t3 = System.nanoTime();
            arr[1] = new InsertionSort();
            long t4 = System.nanoTime();
                       
            long t5 = System.nanoTime();
            arr[2] = new QuickSort();
            long t6 = System.nanoTime();           
            for(ISortStrategy t : arr)
            {
                int[] result;
                result = t.sort(inputData);
                                
                //Test output
                if(inputData!=null)
                {
                    for(int i=0;i<input.length;i++)
                    {
                        if(result==null || outputData[i] != result[i])
                        {
                            System.out.println("Sorting failed");
                            break;
                        }
                    }                    
                }                
            }
            counter++;
            System.out.println("Sorting successful -- " +counter);
            System.out.println("Time taken by Selection sort:" +(t2 - t1));
            System.out.println("Time taken by Insertion sort:" +(t4 - t3));            
            System.out.println("Time taken by Quick sort:" +(t6 - t5)); 
            
        }
    }
    
    private int[] convertStringArraytoIntArray(String[] stringData)
    {
        int[] integerData = new int[stringData.length];
        for(int i=0;i<stringData.length;i++)
        {
            integerData[i] = Integer.parseInt(stringData[i]);
        }
        return integerData;
    }
    
}
