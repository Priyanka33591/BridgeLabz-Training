public class FindMedianSortedArrays {
   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] arr = new int[nums1.length + nums2.length];
            int i = 0;
            int j = 0;
            for(int k = 0 ; k < arr.length ; k++){
                if((i < nums1.length && j < nums2.length) && (nums1[i] <= nums2[j])){
                    arr[k] = nums1[i];
                    i++;
                }else if((i < nums1.length && j < nums2.length) &&  (nums2[j] <= nums1[i])){
                    arr[k] = nums2[j];
                    j++;
                }else if(j >= nums2.length){
                    arr[k] = nums1[i];
                    i++;
                }else if((i >= nums1.length)){
                    arr[k] = nums2[j];
                    j++;
                }
            }

            double ans ;
            int mid = (0 + arr.length)/2;
            if(arr.length % 2 == 0){
                ans = (double)(arr[mid] + arr[mid-1])/2;
            }else{
                ans = arr[mid];
            }

            return ans;
    }
}