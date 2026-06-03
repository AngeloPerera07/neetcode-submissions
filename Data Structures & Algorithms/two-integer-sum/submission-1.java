class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] index = new int[2];
        int i;
        int j;
        for(i = 0; i < nums.length; i++){
            for(j = i+1; j < nums.length; j++){
                /*if(i == nums.length-1){
                    i = 0;
                }
                if(j == nums.length-1){
                    j = 0;
                }*/
                if((nums[i]+nums[j]) == target){
                    //System.out.print("printing" + i + " " + j);
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
                

            }
        }
        return index;
        
    }
}
