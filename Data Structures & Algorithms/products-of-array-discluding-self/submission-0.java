class Solution {
    public int[] productExceptSelf(int[] list) {
        int sum=1;
		int [] res=new int [list.length];
for(int i=0;i<list.length;i++) {
    sum=1;
	for(int j=0;j<list.length;j++){
        if(i!=j) sum*=list[j];
    }
    res[i]=sum;
}

return res;
    }
    
}  
