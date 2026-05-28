class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> s=new HashMap<>();
		// Convert each word to a char array, sort it, and add the string representation of the sorted chars
		for (String a : strs) {
			char[] charArray = a.toCharArray();
			Arrays.sort(charArray);
			// use new String(charArray) to get the contents of the sorted char array
			//s.add(new String(charArray));
			s.putIfAbsent(new String(charArray), new ArrayList<>());
			s.get(new String(charArray)).add(a);
		}
        return new ArrayList<>(s.values());
    }
}
