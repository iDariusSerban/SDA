import java.util.List;

public class FindMaxSubArrayOfLenghtK {


    //10. Find max sum of subarray of length k
    //1,12,-5,-6,50,3,    k=4


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
