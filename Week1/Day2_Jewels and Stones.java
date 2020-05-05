class Solution {
    public int numJewelsInStones(String J, String S) {
       HashMap<String, Integer>hs = new HashMap<>();
        for(int i=0;i<J.length();i++){
            String j= String.valueOf(J.charAt(i));
            hs.put(j,0);
        }
        for(int i=0;i<S.length();i++){
            String s= String.valueOf(S.charAt(i));
            if(hs.containsKey(s)){
                hs.put(s,hs.get(s)+1);
            }
        }
        int total=0;
        // System.out.println(hs);
        for (Map.Entry<String,Integer> entry : hs.entrySet()) {
            total+=entry.getValue();
        }
        
        return total;
    }
}