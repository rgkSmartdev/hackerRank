package org.smartdev.subarray;

import java.io.*;
import java.util.*;

/**
 *  SubArray sum less calculation
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for( int i =0 ; i< n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        // [2, 3, 4, 5, 6]
        for (int j=0; j<n; j++) {
            int subArrSum = 0; // 2, 5, 9, 14, 20
            for (int k=j; k<n; k++) { //
                subArrSum = subArrSum + arr[k];
                if ( subArrSum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
