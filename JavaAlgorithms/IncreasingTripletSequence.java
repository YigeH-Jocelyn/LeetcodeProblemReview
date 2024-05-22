// ***************************************************************************************************************************
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
      // Eliminate the situation that the length of nums is less than 3, where the results must be false
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= first){
                first = num;
            }else if(num <= second){
                second = num;
            }else{
                return true;
              // Update first and second so that there is a sequence, the first element is smaller/equal to 'first', the second element is larger than 'first' and is smaller/equal to 'second', 
              // and the third element is larger than both 'first' and 'second' 
            }
        }return false;
    }
}
// ****************************************************************************************************************************
