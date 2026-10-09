
class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] count = new int[100001];
        int ans = -1;
        int maxcount = 0;

        for (int n : nums) {
            if (n % 2 == 0) {
                count[n]++;
            }
        }

        for (int n = 0; n <= 100000; n += 2) {
            if (count[n] > maxcount) {
                maxcount = count[n];
                ans = n;
            }
        }

        return ans;
    }
}