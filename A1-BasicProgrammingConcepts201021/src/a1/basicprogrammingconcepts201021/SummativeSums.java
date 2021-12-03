package a1.basicprogrammingconcepts201021;

/**
 *
 * @author Anne
 */
public class SummativeSums {

    public static void main(String[] args) {
        int[] arrayA = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arrayB = {999, -60, -77, 14, 160, 301};
        int[] arrayC = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + sumOfArrayMembers(arrayA));
        System.out.println("#2 Array Sum: " + sumOfArrayMembers(arrayB));
        System.out.println("#3 Array Sum: " + sumOfArrayMembers(arrayC));

    }// End of main

    public static int sumOfArrayMembers(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;

    }// End of sumOfArrayMembers

}// End of class
