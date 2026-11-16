class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet();
        int i=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            nums[i]=num;
            i++;
        }
        return set.size();
    }
}