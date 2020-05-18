class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      
        int n=s.length();
        int m=p.length();
        if(n<m)
        return new ArrayList();
        
        int[] pfreq= new int[26];
        int[] sfreq= new int[26];
        for(int i=0;i<m;i++)
        {
            pfreq[p.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++)
        {
            sfreq[s.charAt(i)-'a']++;
        }
        List<Integer> result = new ArrayList();
        //a b c b b d
        for(int i=m;i<n;i++)
        {
            if(Arrays.equals(pfreq,sfreq))
            {
                result.add(i-m);
            }
            sfreq[s.charAt(i)-'a']++;
            sfreq[s.charAt(i-m)-'a']--;
            
        }
        if(Arrays.equals(pfreq,sfreq))
        {
            result.add(n-m);
        }
        return result;
        
    }
}