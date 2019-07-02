package algorithm.leetcode.双指针;

class Solution633 {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i < j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
