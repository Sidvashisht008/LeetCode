class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> time=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<=59;j++){
                String t="";
                if(bitcount(i)+bitcount(j)==num){
                    t=t+i+":";
                    if(j<10){
                        t=t+"0"+j;
                    }else{
                        t=t+j;
                    }
                    time.add(t);
                }
            }
            
        }
        return time;
    }
    public int bitcount(int n){
        int count=0;
        while(n!=0){
            if(n%2!=0){
                count++;
            }
            n/=2;
        }
        return count;
    }
}
