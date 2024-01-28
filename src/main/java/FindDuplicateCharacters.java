import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String s = "asdkafjsf";
        System.out.println(findDuplicateCharacters(s));
    }

    public static Set<Map.Entry<Character, Integer>> findDuplicateCharacters(String s) {

        char[] array = s.toCharArray();
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (result.containsKey(array[i])) {
                result.put(array[i], result.get(array[i]) + 1);
            } else {
                result.put(array[i], 1);
            }
        }
        return result.entrySet();

    }


}
