import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int[] num = {1,0,3,2,5,4,6,7};
		System.out.println(findKthLargest(num, 2));
	}
	
    public static int findKthLargest(int[] nums, int k) {
    	
    	 Integer[] nums1 = Arrays.stream(nums)         // Convert int[] to IntStream
                 .boxed()                            // Convert each int to Integer
                 .toArray(Integer[]::new);           // Convert to Integer array
    	 
    	ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(nums1));
        int temp = 0;
        int kthLargest = 0;
        for(int i=1; i<=k; i++){
            for(Integer num : nums2){
                if(num>=temp){
                    kthLargest = num;
                    temp = num;
                }                
            }
                                                      //  System.out.println(kthLargest);
            nums2.remove(nums2.indexOf(kthLargest));
            temp=0;
        }
		return kthLargest;
    }
}
