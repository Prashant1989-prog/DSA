class Solution {
    public boolean isValid(String s) {
        
        
		Stack<Character> stack=new Stack<>();
		
		        for(char a:s.toCharArray()) {
		        	if(a=='('||a=='{'||a=='[') {
		        		stack.push(a);
		        	}
		        	else {
		        		if(stack.isEmpty()){
		        		return false;
                        }
		        	
		        	char d=stack.pop();
		        	if((a==')' && d!='(') ||(a=='}' && d!='{') ||(a==']' && d!='[')) {
		        		return false;
		        	}
                }
                }
                return stack.isEmpty();
    }
}
