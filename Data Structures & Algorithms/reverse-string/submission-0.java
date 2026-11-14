class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j= s.length-1;
        char temp= s[j];
        while(i<j){
            temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
    }
}