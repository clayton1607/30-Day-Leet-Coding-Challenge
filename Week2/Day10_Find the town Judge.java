class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length<N-1)
            return -1;
        int[] arr = new int[N+1];
        int[] list = new int[N+1];
        for(int i=0; i<trust.length;i++){
            arr[trust[i][0]]++;
            list[trust[i][1]]++;
        }
        
        for(int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]==0 &&  list[i]== N-1){
                    return i;
            }
                
        }
        return -1;
    }
}