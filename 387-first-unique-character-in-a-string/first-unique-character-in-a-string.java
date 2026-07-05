class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int [27];
       for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'a';
            arr[ch]++;
       }

       for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'a';
            if(arr[ch] == 1) return i;
       }
       return -1;
    }
}