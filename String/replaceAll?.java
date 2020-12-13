class Solution {
    public String modifyString(String s) {
	StringBuffer sb = new StringBuffer();
	for(int i=0;i<s.length();i++) 
		if(s.charAt(i)=='?') {
			if((i==0 || sb.charAt(i-1) != 'a') && (i == s.length() -1 || s.charAt(i+1) != 'a'))
				sb.append('a');
			else if((i==0 || sb.charAt(i-1) != 'b') && (i == s.length() -1 || s.charAt(i+1) != 'b'))
				sb.append('b');
			else sb.append('c');
		} else sb.append(s.charAt(i));
	return sb.toString();
}
}
