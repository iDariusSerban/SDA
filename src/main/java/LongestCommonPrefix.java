import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {

    //nput: {“geeksforgeeks”, “geeks”, “geek”, “geezer”} Output: “gee”
    //
    //Input: {“apple”, “ape”, “april”} Output: “ap”

    //ape apple april



    public static String findLongestCommonPrefix(List<String> arr){

        Collections.sort(arr);

        String firstString = arr.get(0);
        String lastString = arr.get(arr.size()-1);

        return findCommonPrefix(firstString,lastString);


    }

    public static String findCommonPrefix(String s1, String s2){
        int i = 0;
        String commonPrefix ="";
        while (s1.charAt(i)==s2.charAt(i) && i<s1.length() && i<s2.length()){
            commonPrefix+=s1.charAt(i);
            i++;
        }
        return commonPrefix;
    }


}
