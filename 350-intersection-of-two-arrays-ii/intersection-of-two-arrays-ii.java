class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                if (map.get(nums1[i]) > 0) {
                    lst.add(nums1[i]);
                }
                map.put(nums1[i], map.get(nums1[i]) - 1);
            }
        }
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            arr[i] = lst.get(i);
        }
        return arr;
    }
}