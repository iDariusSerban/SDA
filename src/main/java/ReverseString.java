public class ReverseString {

    public static void main(String[] args) {
        String givenString = "autocarCu8Roti";

        String result = reverseString(givenString);
        System.out.println(result);


    }

    private static String reverseString(String givenStiring) {
        char[] s = givenStiring.toCharArray();
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return new String (s);
    }
}
