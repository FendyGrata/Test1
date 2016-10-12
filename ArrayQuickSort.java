/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayquicksort;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Phantom
 */
public class ArrayQuickSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" input Number of array:");
        int a = input.nextInt();
        int x[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("index-" + (i + 1) + "=");
            x[i] = input.nextInt();

        }
        System.out.println("Array berfore sort:");
        for (int z : x) {
            System.out.print(" " + z);
        }
        System.out.println(Arrays.toString(x));
        ArrayQuickSort sorter = new ArrayQuickSort();
        
        sorter.sort(x);
        System.out.println("\nArray after sort:");
        for (int z : x) {
            System.out.print(" " + z);
        }
    }

    private int array[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a
             * number from right side which is less then the pivot value. Once
             * the search is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    
}
