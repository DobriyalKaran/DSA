class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        if(pattern.length() != arr.length) return false;

        for(int i=0; i<pattern.length(); i++){
            char ch1 = pattern.charAt(i);
            String s2 = arr[i];

            if(map.containsKey(ch1)){
                String val = map.get(ch1);
                if(val.equals(s2)) continue;
                else return false;
            }
            else {
                if(set.contains(s2)) return false;
                else{
                    map.put(ch1,s2);
                    set.add(s2);
                }
            }
        } 
        return true;
    }
}