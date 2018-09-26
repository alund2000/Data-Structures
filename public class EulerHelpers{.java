public abstract class EulerHelpers{
	
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
	
 	public static boolean isPal(int num){
 		String strNum=""+num;
 		String reverse=new StringBuffer(strNum).reverse().toString();
 			if(strNum.equals(reverse)){
 				return true;
 			}else{
 				return false;
 			}	
 	}
}