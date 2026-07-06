class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {

            // Store first occurrence
            first.putIfAbsent(nums[i], i);

            // Update frequency
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            int currentFreq = freq.get(nums[i]);

            if (currentFreq > degree) {
                degree = currentFreq;
                ans = i - first.get(nums[i]) + 1;
            } else if (currentFreq == degree) {
                ans = Math.min(ans, i - first.get(nums[i]) + 1);
            }
        }

        return ans;
    }
}