// **************************************************************************************************
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for (int each : candies){
          // For each element "each" in the array "candies"
            maxCandy = Math.max(maxCandy, each);
        }
        List<Boolean> result = new ArrayList<>();
        for (int each : candies){
            if(each + extraCandies >= maxCandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;

    }
}
// ****************************************************************************************************
