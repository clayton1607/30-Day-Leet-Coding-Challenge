class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        System.out.println(nums.length/2);
        int start=0;
        int end=0;
        if(nums[nums.length/2] == nums[nums.length/2 +1]){
            if((((nums.length-1)/2) % 2)== 0){
                start=nums.length/2 +2;
                end= nums.length-1;
            }
            else{
                start=0;
                end= (nums.length/2)-1;
            }
        }
        else if(nums[nums.length/2] == nums[nums.length/2 -1]){
            if((((nums.length-1)/2) % 2)== 0){
                start=0;
                end= (nums.length/2)-1;
            }
            else{
                start=nums.length/2 +1;
                end= nums.length-1;
            }
        }
        else{
            return nums[nums.length/2];
        }
        System.out.println(start+ " "+ end);
        for(int i=start; i<=end;i+=2){
            if(i+1 < end){
                if(nums[i]!=nums[i+1])
                    return nums[i];
            }
            else{
                return  nums[i];
            }
            
        }  
        System.out.println("Hello");
        return nums[nums.length/2];
    }
}