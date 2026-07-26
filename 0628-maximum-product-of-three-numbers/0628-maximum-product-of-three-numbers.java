/*class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    max = Math.max(max, nums[i] * nums[j] * nums[k]);
                }
            }
        }

        return max;
    }
}*/

class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = -1000, max2 = -1000, max3 = -1000;
        int min1 = 0, min2 = 0;

        for(int ele : nums){

            if(max1 <= ele){
                max3 = max2;
                max2 = max1;
                max1 = ele;
            }
            else if(max2 <= ele){
                max3 = max2;
                max2 = ele;
            }
            else if(max3 <= ele){
                max3 = ele;
            }

            if(min1 >= ele){
                min2 = min1;
                min1 = ele;
            }
            else if(min2 >= ele){
                min2 = ele;
            }
        }

        return Math.max(
            max1 * max2 * max3,
            min1 * min2 * max1
        );
    }
}