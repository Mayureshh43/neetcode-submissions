class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> anagramList= new HashMap<>();
        for (int i=0; i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String str= new String (charArray);
            if(anagramList.containsKey(str)){
                anagramList.get(str).add(strs[i]);
            }else{
                anagramList.put(str,new ArrayList<>());
                anagramList.get(str).add(strs[i]);
            }
        }
        return new ArrayList<> (anagramList.values());
    }
}
