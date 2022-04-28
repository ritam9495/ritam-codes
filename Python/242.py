class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False;
        freq = {}
        for ch in s:
            if freq.get(ch):
                freq[ch] += 1
            else:
                freq[ch] = 1;
        
        for ch in t:
            if freq.get(ch):
                freq[ch] -= 1
                if freq[ch] < 0:
                    return False;
            else:
                return False;
        return True;