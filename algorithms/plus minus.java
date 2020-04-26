import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        Double positives = 0.000000;
        Double negatives = 0.000000;
        Double zeros = 0.000000;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negatives++;
            }else if(arr[i]>0){
                positives++;
            }else{
                zeros++;
            }
        }
        
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format((positives/arr.length)));
        System.out.println(df.format((negatives/arr.length)));
        System.out.println(df.format((zeros/arr.length)));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
