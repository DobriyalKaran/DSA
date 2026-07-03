class Solution {
    public boolean canConstruct(String s, String b) {
        int[] arr = new int[26];
        for (int i = 0; i < b.length(); i++) {
            int charVal = b.charAt(i) - 'a';
            arr[charVal]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int charVal = s.charAt(i) - 'a';
            if (arr[charVal] > 0) {
                arr[charVal]--;
            } else
                return false;
        }
        return true;
    }
}