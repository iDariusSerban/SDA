import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepChars {


    //pwwwqerere

    public static void main(String[] args) {
        System.out.println(lengthOfLongest("pwwwqerere"));
    }
    public static Integer lengthOfLongest(String s){
        Set<Character> helper = new HashSet<>();
        int max = 0;
        for (Character c: s.toCharArray()) {
            if (!helper.add(c)){
                max = Math.max(max, helper.size());
                helper.clear();
                helper.add(c);
            }
        }
        return max;

    }



}
