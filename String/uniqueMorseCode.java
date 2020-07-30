class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> s = new HashSet<>();
        for(int i = 0;i<words.length;i++){
            s.add(convert(words[i],codes));
        }
        return s.size();
    }
    public String convert(String word,String[] code){
        String res = "";
        for(int i=0;i<word.length();i++){
            res+= code[word.charAt(i)-97];
        }
        return res;
    }
}
