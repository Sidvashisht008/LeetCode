class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s+");
        
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            boolean bool = true;
            if(word.length()>=searchWord.length()){
                for(int j=0;j<searchWord.length();j++){
                    if(word.charAt(j)!=searchWord.charAt(j)){
                        bool = false;
                        break;
                    }
                }
                if(bool){
                    return i+1;
                }
            }
        }
        return -1;
    }
}
