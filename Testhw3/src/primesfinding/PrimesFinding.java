package primesfinding;

public class PrimesFinding {
	public static int MAXPRIMES = 1000;

    public void printPrimes(int n) {
        int curPrime; 
        int numPrimes; 
        boolean isPrime; 
        int[] primes = new int[MAXPRIMES];
        primes[0] = 2;
        numPrimes = 1;
        curPrime = 2;
        while(numPrimes < n) {
            curPrime++; 
            isPrime = true;
            for(int i = 0; i <= numPrimes; i++ ) {
                
                if(isDivisible(primes[i],curPrime)) {
                    
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                
                primes[numPrimes] = curPrime;
                numPrimes++;
            
            }
        }
        
        for(int i = 0; i < numPrimes; i++) {
            System.out.println("Prime: " + primes[i] );

        }
    }
    private static boolean isDivisible(int divisor, int divided){
        if(divisor != 0){
            return (divided % divisor) == 0;
        }
        return false;
    }


}

	