class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        int n = arr.length;
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String val = sortString(arr[i]);
            if (!map.containsKey(val)) {
                List<String> lst = new ArrayList<>();
                lst.add(arr[i]);
                map.put(val, lst);
            } else {
                map.get(val).add(arr[i]);
            }
        }
        return new ArrayList<>(map.values());
    } 

    public static String sortString(String val) {
        char[] chars = val.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}