import java.util.*;

public class GroupAnagrams {

    //: Input: [yo,act,flop,tac,foo,cat,oy,olfp] Output: the anagrams are grouped: [[yo, oy], [flop, olfp], [act,tac,cat], [foo]]


    public static List<List<String>> groupAnagrams(List<String> words){
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String word: words){
            //sortez
            char charArray[] = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord= new String(charArray);
            if (anagramsMap.containsKey(sortedWord)){
                anagramsMap.get(sortedWord).add(word);
            }
            else{
                List<String> value = new ArrayList<>();
                value.add(word);
                anagramsMap.put(sortedWord, value);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key: anagramsMap.keySet()){
            result.add(anagramsMap.get(key));
        }
        return result;
    }

}
