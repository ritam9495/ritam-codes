class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int, int> ref;
        for(int i = 0; i < nums.size(); i++)
        {
            if(ref.find(nums[i]) != ref.end())
                return true;
            ref[nums[i]] = 1;
        }
        return false;
    }
};