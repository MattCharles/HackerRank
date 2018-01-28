import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Rotate an array by d positions to the left.
 * E.g., [1, 2, 3, 4, 5] rotated by 1 position becomes
 * [2, 3, 4, 5, 1].
 */

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        d = d % a.length;
        if(d==0){
            return a;
        }
        int[] solution = new int[a.length];
        for(int i=0; i<a.length; i++){
            solution[i] = a[(i+d) % a.length];
        }
        return solution;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

