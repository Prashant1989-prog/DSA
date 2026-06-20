class Solution {
    public int[] dailyTemperatures(int[] temp) {
       int[] res=new int[temp.length];
		for(int i=0;i<temp.length;i++) {
			int count=0;
			for(int j=i;j<temp.length;j++) {
				if(temp[i]<temp[j]) {
					res[i]=count;
					break;
				}
				count++;
			}
		}
		return res; 
    }
}
