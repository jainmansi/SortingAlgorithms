/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class numberGenerator {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<=1000; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<=999; i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.print("|");
        for (int i=1; i<=1000; i++) {
            System.out.print(i+",");
        }
        
    }
}
