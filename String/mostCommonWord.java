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


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]"," ");
        HashMap<String,Integer> hmap = new HashMap<>();
        String[] para = paragraph.split("\\s+");
        for(int i = 0;i<para.length;i++){
            para[i] = para[i].toLowerCase();
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
        int maxValue = -1;
        String maxKey = "";
        for(Entry <String,Integer> val: hmap.entrySet()){
            if(val.getValue()>maxValue){
                maxKey = val.getKey();
                maxValue = val.getValue(); 
            }
        }
        return maxKey;
    }
}
