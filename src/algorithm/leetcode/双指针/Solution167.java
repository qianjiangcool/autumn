package algorithm.leetcode.双指针;

public class Solution167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else {
                if (numbers[i] + numbers[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return result;
    }


}

