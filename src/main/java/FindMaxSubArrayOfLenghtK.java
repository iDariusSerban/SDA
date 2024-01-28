import java.util.ArrayList;
import java.util.List;

public class FindMaxSubArrayOfLenghtK {


    //10. Find max sum of subarray of length k
    //1,12,-5,-6,50,3,    k=4
    public static void main(String[] args) {

        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(-2);
        arr.add(-6);
        arr.add(50);
        arr.add(3);

        int k = 4;

        System.out.println(findMaxAverage(arr,k));

    }

    public static double findMaxAverage(List<Integer> arr, int k){

        int currentSum = 0;
        for (int i=0; i<k; i++){
            currentSum+= arr.get(i);
        }
        int maxSum = currentSum;

        for (int i=k; i<arr.size(); i++){
            currentSum+= arr.get(i) - arr.get(i-k);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
