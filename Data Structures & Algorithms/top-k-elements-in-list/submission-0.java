class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> s=new HashMap<>();
		// Convert each word to a char array, sort it, and add the string representation of the sorted chars
		for(int i:nums) {
			s.put(i, s.getOrDefault(i, 0)+1);
		}
		List<int []> listData=new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> mp:s.entrySet()) {
			listData.add(new int[] {mp.getValue(),mp.getKey()});
		}
		int []ab=new int[k];
		listData.sort((a,b)->b[0]-a[0]);
		for(int i=0;i<k;i++) {
			ab[i]=listData.get(i)[1];
		}
        
        return ab;
    }
}
