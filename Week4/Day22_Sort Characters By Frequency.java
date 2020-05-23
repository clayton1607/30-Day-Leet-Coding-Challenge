class Solution {
    public String frequencySort(String s) {
        StringBuffer sb= new StringBuffer();
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(Character.toString(s.charAt(i))))
                hm.put(Character.toString(s.charAt(i)),hm.get(Character.toString(s.charAt(i)))+1);
            else{
                hm.put(Character.toString(s.charAt(i)),1);
            }
        }
        Map<String,Integer> map = sortByValue(hm);
         for(Map.Entry m:map.entrySet()){   
            int temp =(int) m.getValue();
             while(temp!=0){
                 sb.append((String)m.getKey()); 
                 temp--;
             }
              
          }  
        return sb.toString();
        
                         
    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}