class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length())
            return false;
        map<char, int> freq;
        for(char ch : s)
        {
            if(freq.find(ch) != freq.end())
                freq[ch]++;
            else
                freq[ch] = 1;
        }
        
        for(char ch : t)
        {
            if(freq.find(ch) != freq.end())
            {
                freq[ch]--;
                if(freq[ch] < 0)
                    return false;
            }
            else
                return false;
        }
        return true;
    }
};