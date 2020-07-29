import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        HashMap<String,Integer> hmap = new HashMap<>();
        String[] para = paragraph.split("\\s+");
        for(int i = 0;i<para.length;i++){
            if(hmap.containsKey(para[i])){
                Integer c = hmap.get(para[i]);
                hmap.put(para[i],c+1);
            }else{
                hmap.put(para[i],1);
            }
        }
        for(int i = 0;i<banned.length;i++){
            hmap.remove(banned[i]);
        }
        return Collections.max(hmap.entrySet(), Map.Entry.comparingByValue()).getKey();
        
    }
}
