class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,Integer> hmap = new HashMap<>();
        for(List<String> path:paths){
            for(String val:path){
                if(!hmap.containsKey(val)){
                    hmap.put(val,1);
                }else{
                    int c = hmap.get(val);
                    hmap.put(val,c+1);
                }
            }
        }
        String des = "";
        for(int i = 0;i<paths.size();i++){
            List<String> path = paths.get(i);
            for(int j = 0;j<path.size();j++){
                if(hmap.get(path.get(j)) == 1 && j ==1){
                    des = path.get(j);
                    break;
                }
            }
        }
        return des;
    }
}
