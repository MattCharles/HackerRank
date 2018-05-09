import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pairs(int k, int[] arr) {
        // Complete this function
        HashSet<Integer> compliments = new HashSet<>();
        int solution = 0;
        for(int a : arr){
            compliments.add(a);
        }
        for(int b : arr){
            if(compliments.contains(b+k)){
                solution++;
            } 
            if(compliments.contains(b-k)){
                solution++;
            }
        }
        return solution/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}

