class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        while(k > 0){
            int max = Integer.MIN_VALUE; 
            int tempMaxNum = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(max < entry.getValue()){
                    max = entry.getValue();
                    tempMaxNum = entry.getKey();
                }
            }
            lst.add(tempMaxNum);
            map.remove(tempMaxNum);
            max = Integer.MIN_VALUE; 
            tempMaxNum = 0;
            k--;
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}