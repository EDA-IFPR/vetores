class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length > 1){
            int k = 1;
            int aux = 0;
            for (int i = 1; i < nums.length; i++) {
                if(nums[k-1] != nums[i]) {
                    aux = nums[i];
                    nums[k] = aux;
                    k++;
                }
            }
            return k;
        }
        return 1;
    }
}