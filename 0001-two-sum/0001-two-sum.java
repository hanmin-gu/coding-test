class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        int length = nums.length;
        int x  = 0;
        for(int i = 0; i < length; i++){
            x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
             map.put(nums[i], i);
        }
        return null;
    }

}