class Solution {
    public int firstUniqChar(String s) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int x=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            x=(int)s.charAt(i);
            if(map.containsKey(x))
                map.put(x, map.get(x)+1);
            else
                map.put(x, 1);
        }
        if(!map.containsValue(1))
            return -1;
        // for(Map.Entry m:map.entrySet()){ 
        //     temp=(int)m.getValue();
        //     if(temp == 1){
        //         x=((String)m.getKey()).charAt(0);
        //         break;
        //     }
        //      // System.out.println(m.getValue()+" "+ m.getKey());
        // }   
        //  // System.out.println(x);
        // if(x=='!')
        //     return -1;
        for(int i=0;i<s.length();i++){
            x=(int)s.charAt(i);
            if(map.get(x)==1)
                return i;
        }
        return -1;
    }
}