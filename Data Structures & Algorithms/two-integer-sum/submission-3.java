class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            if(mp.containsKey(find)){
                a[0]=mp.get(find);
                a[1]=i;
                return a;
            }
            mp.put(nums[i],i);
            
        }
        return a;
    }
}
