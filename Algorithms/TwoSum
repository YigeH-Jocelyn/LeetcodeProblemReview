
***********************************************************************************************************
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> hash; 
// sort the intergers in order and store tham in a hash table
        for (int i=0; i<nums.size(); i++)
// for an integer i, if i is smaller than the size of nums, then increment i by 1
        {
            hash[nums[i]] = i;
            }
            for (int i=0; i<nums.size();i++) 
            {
                int complement = target - nums[i];
                if (hash.find(complement) != hash.end() && hash[complement] != i) 
                return {i, hash[complement]};
            }
            return{};
    }
};
***********************************************************************************************************
