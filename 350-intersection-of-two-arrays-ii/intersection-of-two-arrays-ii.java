class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> lst = new ArrayList<>();
        int[] arr = new int[1001];

        for (int i = 0; i < nums2.length; i++) {
            arr[nums2[i]]++;
        }

        for (int i = 0; i < nums1.length; i++) {
            if (arr[nums1[i]] > 0)
                lst.add(nums1[i]);
            arr[nums1[i]]--;
        }
        return lst.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}