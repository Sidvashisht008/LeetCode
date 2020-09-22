class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        Deque<Character> deque = new LinkedList<>();
        for (char w: s.toCharArray()) {
            deque.add(w);
        }
        Character w = deque.peekFirst();
        
        for (Character c: t.toCharArray()) {
            if (c == w) {
                if (deque.size() >= 1) {
                    deque.pollFirst();
                    w = deque.peekFirst();
                } else {
                    break;
                }
            }
        }
        return (deque.size() == 0) ?  true : false;
    }
}
