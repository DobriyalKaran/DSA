class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> lst = new ArrayList<>();
        for(int i : nums){
            if(i != val) lst.add(i);
        }
        for(int i=0; i<lst.size(); i++) nums[i] = lst.get(i);
        return lst.size();
    }
}