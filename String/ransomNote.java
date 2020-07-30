import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i = 0;i<magazine.length();i++){
            if(hmap.containsKey(magazine.charAt(i))){
                Integer c = hmap.get(magazine.charAt(i));
                hmap.put(magazine.charAt(i),c+1);
            }else{
                hmap.put(magazine.charAt(i),1);
            }
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(!hmap.containsKey(ransomNote.charAt(i))){
                return false;
            }else if(hmap.containsKey(ransomNote.charAt(i))){
                Integer c = hmap.get(ransomNote.charAt(i));
                hmap.put(ransomNote.charAt(i),c-1);
            }
        }
        for(Entry <Character,Integer> val: hmap.entrySet()){
            if(val.getValue()<0){
                return false;
            }
        }
        return true;
    }
}
