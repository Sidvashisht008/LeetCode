class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> res = new ArrayList<>();
        for(String query:queries){
            int cnt =0;
            for(String Word:words){
                if(freq(query,Word)){
                    cnt++;            
                }
            }
            res.add(cnt);
        }
        int[] ret = new int[res.size()];
        Iterator<Integer> iterator = res.iterator();
        for (int i = 0; i < ret.length; i++){
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }
    public boolean freq(String query,String Word){
        char[] ch1 = query.toCharArray();
        char[] ch2 = Word.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i = 0;
        while(i<ch1.length-1 && ch1[i]==ch1[i+1]){
            i++;
        }
        int j = 0;
        while(j<ch2.length-1 && ch2[j]==ch2[j+1]){
            j++;
        }
        if(j>i){
            return true;
        }return false;
    }
}
