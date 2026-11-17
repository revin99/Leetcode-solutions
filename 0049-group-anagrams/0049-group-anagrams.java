class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String s = strs[i];

            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            mp.computeIfAbsent(sorted, k-> new ArrayList<>()).add(strs[i]);
        }

        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry: mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;

    }
}