import java.util.*;
class DuplicateOptimized {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,1};
        
        System.out.println(containsDuplicate(nums));
    }
}