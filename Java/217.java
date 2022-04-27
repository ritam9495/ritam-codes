class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> ref = new HashMap<>();
        
        for(int i:nums)
        {
            if(ref.containsKey(i))
                return true;
            ref.put(i,1);
        }
        return false;
    }
}