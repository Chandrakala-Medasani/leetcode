class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++)
            nums3[i]=nums1[i];

        int k=nums1.length;
        for(int i=0; i<nums2.length;i++){
            nums3[k]=nums2[i];
            k++;
        }
        Arrays.sort(nums3);
        int x=nums3.length;
        if(x%2==0)
            return (nums3[x/2-1]+nums3[x/2])/2.0;

        return nums3[x/2];
    }
}
