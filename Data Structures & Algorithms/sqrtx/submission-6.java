class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j= x/2;
        int target= Integer.MAX_VALUE;
        if(x==0 || x==1){
            return x;
        }
        while(i<=j){
            int mid = i+(j-i)/2;
            long square = (long) mid * mid;
            if(x== square){
                return mid;
            }else if(square > x){
                target= mid-1;
                j=mid-1;
            }else{
                target = mid;
                i=mid+1;
            }
        }
        return target;
    }
}