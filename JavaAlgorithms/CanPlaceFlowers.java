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
            
        for (int i = 0; i < flowerbed.length; i++) {
            if(i==0){
                if(flowerbed[i+1] == 0 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
                continue;
            }
            if(i==flowerbed.length-1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0){
                    flowerbed[flowerbed.length-1] = 1;
                    n--;
                }
                 continue;
            }
            if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
                System.out.println(n);
            }
        }
        return n<=0;
    }
}
// *****************************************************************************************************************
