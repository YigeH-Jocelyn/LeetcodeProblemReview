// ******************************************************************************************************************8
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(flowerbed[0] == 1 && n > 0)
                return false;
            if(n > 1)
                return false;
            return true;
        }
            // for array with size of 1.
        for (int i = 0; i < flowerbed.length; i++) {
            if(i==0){
                if(flowerbed[i+1] == 0 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
                // to fill the first cell with 1 if it and the cell after it are 0
                continue;
            }
            if(i==flowerbed.length-1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0){
                    flowerbed[flowerbed.length-1] = 1;
                    n--;
                }
                // to fill the last cell with 1 if it and the cell before it are 0
                 continue;
            }
            if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
                // fill the cells with 1 if the cells before and after it are also 0.
                System.out.println(n);
            }
        }
        return n<=0;
    }
}
// *****************************************************************************************************************
