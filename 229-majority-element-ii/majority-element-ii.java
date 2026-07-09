class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1 = Integer.MIN_VALUE;
        int c1 = 0;
        int el2 = Integer.MIN_VALUE;
        int c2 = 0;
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(c1 == 0 && nums[i] != el2){
                el1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0  && nums[i] != el1){
                el2 = nums[i];
                c2 = 1;
            }
            else if(nums[i] == el1 ) c1++;
            else if(nums[i] == el2) c2++;
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]== el1) c1++;
            if(nums[i] == el2) c2++;
        }
        int n = (int)(nums.length / 3) + 1;
        if(c1 >= n) lst.add(el1);
        if(c2 >= n) lst.add(el2);

        return lst;
    }
}