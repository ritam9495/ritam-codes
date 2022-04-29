class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = {-1, -1};
        HashMap<Integer, Integer> ref = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int dif = target - nums[i];
            if(ref.containsKey(dif))
            {
                result[0] = i;
                result[1] = ref.get(dif);
                break;
            }
            ref.put(nums[i], i);
        }
        return result;
    }
}