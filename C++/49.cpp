class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<vector<int>, vector<string>> gans;
        
        for (string str : strs)
        {
            vector<int> alpha(26);
            for(char ch : str)
            {
                alpha[ch - 'a'] += 1;
            }
            gans[alpha].push_back(str);
        }
        
        vector<vector<string>> result;
        
        for(map<vector<int>, vector<string>>::iterator it = gans.begin(); it != gans.end(); ++it)
        {
            result.push_back(it->second);
        }
        return result;
    }
};