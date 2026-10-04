class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> anagramList= new HashMap<>();
        for (int i=0; i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String str= new String (charArray);
            anagramList
            .computeIfAbsent(str, k -> new ArrayList<>())
            .add(strs[i]);
        }
        return new ArrayList<> (anagramList.values());
    }
}
