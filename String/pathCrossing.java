class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<List<Integer>> s = new HashSet<>();
        List<Integer> origin = new ArrayList<>();
        origin.add(0);
        origin.add(0);
        s.add(origin);
        for(int i = 0; i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='S'){
                y--;
            }else if(path.charAt(i)=='E'){
                x++;
            }else{
                x--;
            }
            List<Integer> res = new ArrayList<>();
            res.add(x);
            res.add(y);
            if(s.contains(res)){
                return true;
            }else{
                s.add(res);
            }
        }
        return false;
    }
}
