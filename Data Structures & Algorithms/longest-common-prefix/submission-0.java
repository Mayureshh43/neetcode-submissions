class Solution {
    public String longestCommonPrefix(String[] strs) {
        String base= strs[0];
        StringBuilder result=new StringBuilder();
        for(int i=0;i<base.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()){
                    return result.toString();
                }else{
                if(base.charAt(i)!= strs[j].charAt(i)){
                    return result.toString();
                }
                }
            }
            result.append(base.charAt(i));
        }
        return result.toString();
    }
}