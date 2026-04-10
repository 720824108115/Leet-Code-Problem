class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int pointer=i-1;
            while(pointer>=0 && nums[pointer]>key){ 
                nums[pointer + 1] = nums[pointer];     
                pointer--;                                   
            }
            if(pointer>=0 && nums[pointer]==key)
                return true;
            nums[pointer+1]=key;
        }
        return false;
    }
}