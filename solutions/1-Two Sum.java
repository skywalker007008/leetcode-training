import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];
            if (map.containsKey(gap)) {
                int pl = map.get(gap);
                return new int[]{pl, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}