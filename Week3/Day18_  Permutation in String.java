class Solution {
    public boolean checkInclusion(String p, String s) {
            if(p.length()>s.length())
                return false;
            int[] pcount = new int[26];
            int[] scount = new int[26];
            for(int i=0;i<p.length();i++){
                pcount[p.charAt(i)-'a']++;;
            }
            for(int i=0;i<p.length();i++){
                scount[s.charAt(i)-'a']++;;
            }
            for(int i=p.length();i<s.length();i++){
                // for(int j=0;j<26;j++)
                //     System.out.print(pcount[j]+" ");
                // System.out.println();
                // for(int j=0;j<26;j++)
                //     System.out.print(scount[j]+" ");
                // System.out.println();
                if(Arrays.equals(pcount,scount)){
                    return true;
                }
                scount[s.charAt(i)-'a']++;
                scount[s.charAt(i-p.length())-'a']--;
                
            }
            if(Arrays.equals(pcount,scount))
                    return true;
            return false;
    }
}