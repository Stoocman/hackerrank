import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean missing = false;
        HashMap<String,Integer> hashm = new HashMap<>();
        for(String word:magazine){
            if(hashm.containsKey(word)){
                hashm.put(word, hashm.get(word)+1);
            }else{
                hashm.put(word,1);
            }
        }

        for(String word:note){
            if(!hashm.containsKey(word)){
                missing = true;
                break;
            }else{
               int remain = hashm.get(word);
               if(remain>1){
                   hashm.put(word,remain-1);
               }else{
                   hashm.remove(word);
               }
            }
        }

        String res = (missing) ? "No":"Yes";
        System.out.println(res);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}