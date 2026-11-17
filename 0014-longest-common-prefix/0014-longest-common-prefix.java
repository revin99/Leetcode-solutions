class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();

        int mn = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            mn = Math.min(mn,strs[i].length());
        }
        for(int i=0;i<mn;i++){
            char c = strs[0].charAt(i);
            boolean flg = true;
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    flg = false; break;
                }
            }
            if(flg){
                s.append(c);
            }else{
                break;
            }
        }

        return s.toString();
    }
}