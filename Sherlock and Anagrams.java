import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int anagram = 0;
        HashSet<Integer> table = new HashSet<>();
        
        int buffer = 1;
        while(buffer<=s.length()){
            for(int i=0;i+buffer<=s.length();i++){
                int sub1 = asciiValue(s.substring(i,i+buffer));
                //for(int j=i+1;j+buffer<s.length();j++){
                    /*if(j+buffer==s.length()) break;
                    int sub2 = asciiValue(s.substring(j,j+buffer));
                    System.err.println("sub2:" + (j+buffer));
                    if(sub2 == sub1) anagram++;*/
                //}
            }
            buffer++;
        }
        return anagram;
    }

    a a a a 
    0 1 2 3
i   0 1 2 3
    
    private static int asciiValue(String s){
        int result = 0;
        for(int i=0;i<s.length();i++){
            result = result + s.charAt(i);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
