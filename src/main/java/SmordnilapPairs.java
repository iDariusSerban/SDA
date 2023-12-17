import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmordnilapPairs {

    //Given an array,
    // generate the pairs of words that are written in reversed way.
    // Example: Input: [diaper, abc, test, cba, repaid] Output: [[diaper, repaid], [abc, cba]]


    //parcurg array-ul
    //pentru cuvantul curent, ii gasesc inversul
    //daca exista deja inversul in set, atunci imi fac un array din invers si curent si il adaug la rezultat
    //daca nu, bag curent in set


    public List<List<String>> generatePairs (List<String> words){
        Set<String> helper = new HashSet<>();
        List<List<String>> result = new ArrayList<>();
        for (String word: words){
            String reverse = new StringBuilder(word).reverse().toString();
//            if (helper.contains(reverse)){
//                List<String> currentPair = new ArrayList<>();
//                currentPair.add(word);
//                currentPair.add(reverse);
//                result.add(currentPair);
//            }
//            else{
//                helper.add(word);
//            }


            if (!helper.add(word)){
                List<String> currentPair = new ArrayList<>();
                currentPair.add(word);
                currentPair.add(reverse);
                result.add(currentPair);
            }
        }
        return result;
    }

}
