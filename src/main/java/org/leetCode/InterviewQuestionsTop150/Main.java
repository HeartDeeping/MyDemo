package org.leetCode.InterviewQuestionsTop150;

import java.util.Arrays;

/**
 * 面试经典150题
 */
public class Main {
/*    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int m = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[m] = nums[i];
                m++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }*/

    public static void main(String[] args) {
        int[] nums = {3,1,5,3,6,4};
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        System.out.println("我的提交");
    }
}
