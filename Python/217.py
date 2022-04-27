class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        ref = {}
        for i in nums:
            if ref.get(i) == 1:
                return True
            ref[i] = 1
        return False