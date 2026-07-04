class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] arr = new int[58];

        for (int i = 0; i < stones.length(); i++) {
            int val = stones.charAt(i) - 'A';
            arr[val] = arr[val] + 1;
        }

        for (int i = 0; i < jewels.length(); i++) {
            int val = jewels.charAt(i) - 'A';
            count += arr[val];
        }
        return count;
    }
}