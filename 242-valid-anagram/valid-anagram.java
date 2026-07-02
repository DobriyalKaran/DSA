class Solution {
    public boolean isAnagram(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m)
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Character ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            Character ch = s2.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    map.put(ch, map.get(ch) - 1);
                }
                else return false;
            } else
                return false;

        }
        return true;
    }
}