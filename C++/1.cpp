class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result = {-1, -1};
        map<int, int> ref;
        
        for(int i = 0; i < nums.size(); i++)
        {
            int dif = target - nums[i];
            if(ref.find(dif) == ref.end())
                ref[nums[i]] = i;
            else
            {
                result[0] = i;
                result[1] = ref[dif];
                break;
            }
        }
        return result;
    }
};