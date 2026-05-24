class Solution {
    public int[] getConcatenation(int[] nums) {
        int num = nums.length;
        int newSize= num*2;
        int [] ans= new int[newSize];
        for(int i=0; i<nums.length;i++){
            ans[i]=nums[i];
            ans[nums.length+i]=nums[i];
        }
        return ans;
    }
}