class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
        // int left=1,right=x/2;
        // if(x==0)
        //     return 0;
        // if(x==1)
        //     return 1;
        // while(left<=right){
        //     long mid = (left+right)/2;
        //     if(mid*mid==x)
        //         return (int)mid;
        //     else if(x>mid*mid)
        //         left=(int)mid+1;
        //     else
        //         right=(int)mid-1;
        // }
        // return -1;
    }
}
