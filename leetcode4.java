//https://leetcode.com/problems/median-of-two-sorted-arrays/
class leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0,j=0,k=0;
        int[] merge = new int[m+n];
        while (i<m && j<n){
            if (nums1[i]<nums2[j]){
                merge[k++] = nums1[i++];
            }
            else
                merge[k++] = nums2[j++];
        }
        while (i<m)
            merge[k++] = nums1[i++];
        while (j<n)
            merge[k++] = nums2[j++];
        double result = 0.00000;
        int index = m+n;
        int p = index/2;
        if (index%2==0){

            result =((double)merge[p]+ (double)merge[p-1])/2 ;
        }
        else
            result = merge[p];
        return result;
    }
}

}