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
        
        for(int i=0;i<s.length();i++){
            int buffer = 1;
            while(buffer<=s.length() && i+buffer<=s.length()){
                String sub = s.substring(i,i+buffer);
                int ascii = asciiValue(sub);
                if(table.contains(ascii)){
                    System.err.println("anagram:"+sub);
                    anagram++;
                }else{
                    table.add(ascii);
                }
                buffer++;
            }
        }
        return anagram;
    }

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
