import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//11. Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
// and return an array of the non-overlapping intervals that cover all the intervals in the input.
//Example: Input: intervals = [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
public class MergeIntervals {
    //structura de date ajutattoare?
    //brute force: ex: luam fiecare cu fiecare (generam toate perechile din array)
    //sortam array-ul
    //parcurgem cu 2 pointenri

    //sortez intervalele dupa capetele din stanga
    //parcurg fiecare interval
    //verific daca intervalul curent se suprapune cu intervalul urmator
       //daca da, retin capatul din stanga al primului si capatul din dreapta la al doilea ca fiind intervalul curent
       //daca nu, trec la intervalul urmator


    public static void main(String[] args) {
        List<List<Integer>> intervals = new ArrayList<>();
        List<Integer> i1 = new ArrayList<>();
        List<Integer> i2 = new ArrayList<>();
        List<Integer> i3 = new ArrayList<>();
        List<Integer> i4 = new ArrayList<>();
        i1.add(1);
        i1.add(3);
        i2.add(2);
        i2.add(6);
        i3.add(5);
        i3.add(10);
        i4.add(15);
        i4.add(18);
       intervals.add(i1);
       intervals.add(i2);
       intervals.add(i3);
       intervals.add(i4);

        System.out.println(merge(intervals));
    }

    public static List<List<Integer>> merge (List<List<Integer>> intervals){

        intervals.sort((a,b) -> Integer.compare(a.get(0),b.get(0)));
        List<Integer> currentInterval = intervals.get(0);
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> interval: intervals){
            //daca capatul din stanga al intervalului urmator e mai mic decat capatul din dreapta al intervalului curent
            if (interval.get(0)<currentInterval.get(1)){
                currentInterval.set(1, interval.get(1));
            } else{
                result.add(currentInterval);
                currentInterval = interval;
            }
        }
        result.add(currentInterval);
        return result;

    }


}
