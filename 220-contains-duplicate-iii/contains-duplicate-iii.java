class Solution {

    private long getBucketId(long num, long size) {
        if (num >= 0)
            return num / size;
        return ((num + 1) / size) - 1;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        if (valueDiff < 0)
            return false;

        HashMap<Long, Long> map = new HashMap<>();

        long bucketSize = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {

            long num = nums[i];
            long bucket = getBucketId(num, bucketSize);

            // Same bucket
            if (map.containsKey(bucket))
                return true;

            // Left bucket
            if (map.containsKey(bucket - 1) &&
                Math.abs(num - map.get(bucket - 1)) <= valueDiff)
                return true;

            // Right bucket
            if (map.containsKey(bucket + 1) &&
                Math.abs(num - map.get(bucket + 1)) <= valueDiff)
                return true;

            map.put(bucket, num);

            // Maintain sliding window
            if (i >= indexDiff) {
                long oldBucket = getBucketId(nums[i - indexDiff], bucketSize);
                map.remove(oldBucket);
            }
        }

        return false;
    }
}