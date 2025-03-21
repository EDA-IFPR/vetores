import java.util.Arrays;

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
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false; 
        } 
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr, tArr);
    }
}