import java.util.List;

public class LargestSumSubarray {

   // [-2,1,-3,4,-1,2,1,-5,4]

    //maxSoFar - suma maxima dintre toate subarrat-uyrile de pana acum. Se initiliaza cu -2
    //maxEndingHere - suma maxima a subarray-urilor care se termina la pozitia curenta. Se initializeaza cu -2

    //m1 = 6, m2 = 5

    public static Integer maxSumSubarray(List<Integer> arr){
        int maxSoFar = arr.get(0);
        int maxEndingHere = arr.get(0);
        for (int i = 1; i< arr.size(); i++){
            maxEndingHere = Math.max(arr.get(i), maxEndingHere+arr.get(i));
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }

}
