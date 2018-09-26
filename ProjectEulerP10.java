public class ProjectEulerP10{
	public static void main(String[] args){
		System.out.println(sumPrimes(2000000));
 }
 //Problem 10: gives the sum of the primes less than a given ceiling
 	public static String sumPrimes(long ceiling){
 		long sum=2;
 		for(long i=3;i<ceiling;i+=2){
 			if(isPrime(i)){
 				sum+=i;
 			}
 		}
 		return "the sum of the primes less than "+ceiling+" is "+String.format("%,d",sum);
 	}


 	public static boolean isPrime(long n){
    	boolean prime = true;
    	if (n<2) return false;
    	if (n==2) return true;
    	if (n%2==0) return false;
    	for (long i = 3; i<=Math.sqrt(n);i+=2){
        	if (n%i==0){
            	prime=false;
            	break;
        	}
    	}
    		return prime;
	}

}