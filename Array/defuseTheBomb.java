class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        int k1 = k;
        if(k>0){
            for(int i = 0;i<code.length;i++){
                for(int j = i+1;k1>0;j++){
                    j = j%code.length;
                    res[i] +=code[j];
                    k1--;
                }
                k1 = k;
            }
        }else if(k<0){
            k = -1*k;
            k1 = (k);
            int i = 0;
            int j = code.length-1;
            while(i<j){
                int temp = code[i];
                code[i] = code[j];
                code[j] = temp;
                i++;
                j--;
            }
            for(int m = 0;m<code.length;m++){
                for(int n = m+1;k1>0;n++){
                    n = n%code.length;
                    res[m] +=code[n];
                    k1--;
                }
                k1 = k;
            }
            i = 0;
            j = res.length-1;
            while(i<j){
                int temp = res[i];
                res[i] = res[j];
                res[j] = temp;
                i++;
                j--;
            }
        }
        return res;
    }
}
