class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int count = -1;
	Set<Character>set = new HashSet<Character>();
	for(char each: s.toCharArray()) {
		if(!set.contains(each)) {
			int a = s.lastIndexOf(each) - s.indexOf(each);
			count = count < a ? a:count;
		}
	}
        return count-1;
    }
}
