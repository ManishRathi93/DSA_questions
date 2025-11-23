package Array;

public class SmallestPerfectSquareWithoutZero {
    public static void main(String[] args) {
        int k = 3;
        System.out.println(smallestPerfectSquareWithoutZero(4));
    }

    static int smallestPerfectSquareWithoutZero(int digits) {
        int low = (int) Math.pow(10, digits - 1);
        int high = (int) Math.pow(10, digits) - 1;

        int start = (int) Math.ceil(Math.sqrt(low));
        int end = (int) Math.floor(Math.sqrt(high));

        for (int i = start; i <= end; i++) {
            int sq = i * i;
            if (!String.valueOf(sq).contains("0")) {
                return sq; // smallest square without zero
            }
        }
        return -1;
    }
}
