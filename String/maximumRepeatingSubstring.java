class Solution {
  public int maxRepeating(String sequence, String word) {
    String substring = word;
    int sequenceLen = sequence.length();
    int count = 0;
    
    for (int i = 0; i < sequenceLen; i++) {
      if (sequence.contains(substring)) {
        substring += word;
        count++;
      } else {
        return count;
      }
    }
    return count;
  }
}
