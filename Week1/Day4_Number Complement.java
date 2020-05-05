class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuffer sb= new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                sb.replace(i,i+1,"0");
            }else{
                sb.replace(i,i+1,"1");
            }
            // System.out.println(sb);
        }
        s=sb.toString();
        return Integer.parseInt(s,2);
    }
}