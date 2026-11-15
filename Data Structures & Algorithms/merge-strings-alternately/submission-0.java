
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        StringBuilder br= new StringBuilder();
        int size = (word1.length()>word2.length()) ? 
        word2.length():word1.length();
        while(i<size){
            br= br.append(word1.charAt(i));
            br= br.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            br= br.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            br=br.append(word2.charAt(j));
            j++;
        }
        return br.toString();
    }
}