class Solution {
    public int numPrimeArrangements(int n) {
        
        int totalPrime=countPrime(n);
        long fact=1;
           for(int i=1;i<=totalPrime;i++){    
            fact=(fact*i)%1000000007;    
         }
           for(int i=1;i<=n-totalPrime;i++){    
            fact=(fact*i)%1000000007;    
         } 
        
        
        return (int)fact;
        
    }
    
    public int countPrime(int n)
    {
       int count=0;
       boolean[] isPrime=new boolean[n+1];
       for(int i=0;i<=n;i++)
       {
           isPrime[i]=true;
       }
       for(int i=2;i*i<=n;i++)
       {
           if(isPrime[i]==true)
           {
               for(int j=i*i;j<=n;j+=i)
               {
                   isPrime[j]=false;
               }
           }
       }
       for(int i=2;i<=n;i++)
       {
           if(isPrime[i]==true)
               count++;
       }
        
    return count;
        
    }
}
