class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(freq.containsKey(ch))
                freq.put(ch, freq.get(ch) + 1);
            else
                freq.put(ch, 1);
        }
        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(freq.containsKey(ch))
            {
                freq.put(ch, freq.get(ch) - 1);
                if(freq.get(ch) < 0)
                    return false;
            }
            else
                return false;
        }
        return true;
    }
}