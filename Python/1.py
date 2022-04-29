class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = [-1, -1]
        ref = {}
        for i in range(0, len(nums)):
            dif = target - nums[i]
            if ref.get(dif) != None:
                result[0] = i
                result[1] = ref[dif]
                break
            else:
                ref[nums[i]] = i
        return result