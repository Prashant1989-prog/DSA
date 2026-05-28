class Solution {
    public boolean isPalindrome(String s) {
        // int j=s.length-1;
        StringBuilder sp=new StringBuilder();
		for(char p:s.toCharArray()) {
			if(Character.isLetterOrDigit(p)) {
				sp.append(Character.toLowerCase(p));
			}
		}
        return sp.toString().equals(sp.reverse().toString());
    }
}
