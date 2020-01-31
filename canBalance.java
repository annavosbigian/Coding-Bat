/*
https://techdevguide.withgoogle.com/paths/foundational/canbalance-problem-arrays-non-empty/#!
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public class canBalance {
    public boolean canBalance(int[] nums) {
        //sums to compare
        int sum1 = 0;
        int sum2 = 0;
        //find the midpoint
        int half = nums.length / 2;
        for (int i = 0; i < half; i++) {
            sum1 += nums[i];
        }
        for (int j = half; j < nums.length; j++) {
            sum2 += nums[j];
        }
        if (sum1 == sum2) {
            return true;
        }
        //temp makes this more efficient as it searches from the middle going both ways
        int temp1 = sum1;
        int temp2 = sum2;
        int lowerhalf = half;
        while (lowerhalf >= 0) {
            sum1 += nums[half];
            sum2 -= nums[half];
            temp1 -= nums[lowerhalf];
            temp2 += nums[lowerhalf];
            half++;
            lowerhalf--;
            if (sum1 == sum2 || temp1 == temp2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] int1 = {1, 1, 1, 1, 4};
        int[] int2 = {10, 0, 1, -1, 10};
        int[] int3 = {10, 5, 5, 10};
        canBalance cb = new canBalance();
        System.out.println(cb.canBalance(int1));
        System.out.println(cb.canBalance(int2));
        System.out.println(cb.canBalance(int3));
    }
}
