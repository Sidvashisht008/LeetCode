class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            set[allowed.charAt(i)-'a'] = true;
        }
        
        int tot = 0;
        for (int i = 0; i < words.length; i++) {
            boolean match = true;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (!set[ch-'a']) {
                    match = false;
                    break;
                }
            }
            if (match) tot++;
        }
        return tot;
    }
}
