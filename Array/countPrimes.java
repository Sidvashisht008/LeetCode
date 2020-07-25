class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n==1){
            return 0;
        }
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0]= false;
        primes[1]= false;
        for(int i = 2 ;i*i<primes.length;i++){
            if(primes[i]){
                for(int j = i*i;j<primes.length;j+=i){
                    primes[j] = false; 
                }
            }
        }
        int cnt=0;
        for(int i = 2;i<n;i++){
            if(primes[i]==true){
                cnt++;
            }
        }
        return cnt;
    }
}
