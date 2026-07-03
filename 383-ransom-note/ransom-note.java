class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Will Create a Freq Map
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(freqMap.containsKey(ch)){
                if(freqMap.get(ch) > 0){
                    freqMap.put(ch, freqMap.get(ch)-1);
                }
                else return false;
            }
            else return false;
        }
        return true;
    }
}