// ********************************************************************************************
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int right = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
      // Initialize result with 1, so the first element is not going through the following calculation.
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
      // Calculate the product of the left side, except the nums[i] it self
        for(int i = nums.length -1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }
      // Calculate the product on the right side, except nums[i] itself.
        return result;
    }
}
// *********************************************************************************************
