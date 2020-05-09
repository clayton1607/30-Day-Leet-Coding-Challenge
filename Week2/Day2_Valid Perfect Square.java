class Solution {
    public boolean isPerfectSquare(int num) {
        int res = 0; 
        int n = num; 
        while(n>0){
            
            int half = (n/2);
            //System.out.println(half);
            if(half*half>num || half*half<0)
                n=n/2;
            else if( half * half <=num && half*half>=0){
                for(int i = half; i<=n; i++){
                    if(i * i ==num)
                        return true;
                }
                return false;
            }
        }
        return false;
    }
}
