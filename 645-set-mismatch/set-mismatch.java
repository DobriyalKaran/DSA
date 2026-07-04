class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                lst.add(nums[i]);
                break;
            }
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                lst.add(i);
                break;
            }
        }
        return lst.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}