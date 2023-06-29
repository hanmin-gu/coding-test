class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] result = new int[n];
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < n; i++){
            if(index1 == nums1.length){
                result[i] = nums2[index2++];
            }
            else if(index2 == nums2.length){
                result[i] = nums1[index1++];
            }
            else if(nums1[index1] < nums2[index2]){
                result[i] = nums1[index1++];
            }
            else if (nums2[index2] < nums1[index1]){
                result[i] = nums2[index2++];
            }
            else{
                result[i] = nums1[index1++];
                i++;
                result[i] = nums2[index2++];
            
            }
        }
    
        if(n % 2 == 0){
            return (result[(n / 2) - 1] + result[n / 2]) / (double) 2;
        }
        return result[n / 2];
    }
}