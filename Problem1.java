
//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes



class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1]*nums[i-1];
        }
        for(int i = nums.length -1; i >= 0; i--){
            result[i] = prod * result[i];
            prod = prod * nums[i];
        }
        return result;
    }
}
