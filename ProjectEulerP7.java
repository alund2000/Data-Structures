public class ProjectEulerP7 extends EulerHelpers{
 public static void main(String[] args){
 	System.out.println(nthPrime(10001));
 }

 //Problem 7: gives the nth prime
 	public static String nthPrime(int n){
 		int numPrime=0;
 		int i=0;
 		while(numPrime<n){
 			if(isPrime(i)){
 				numPrime++;
 			}
 			i++;
 		}

 		return "The "+n+"th prime is "+String.format("%,d",i);
 	}

}