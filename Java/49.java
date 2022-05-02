class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> gans = new HashMap();
        
        for(String s: strs){
            char[] alpha = new char[26];
            for(char c: s.toCharArray()){
                alpha[c-'a']++;
            }
            String str=new String(alpha);
            
            if(gans.get(str)==null){
                gans.put(str, new ArrayList<>());
            }
            gans.get(str).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        res.addAll(gans.values());
        return res;
    }
}