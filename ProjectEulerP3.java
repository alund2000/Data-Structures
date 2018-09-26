public class ProjectEulerP3 extends EulerHelpers{
	public static void main(String[] args){
 
		System.out.println(maxPrimeFactor(600851475143.0));
		System.out.println(isPrime(486847));
 }

 	//Problem 3: Gives the largest prime factor of a given number
 	public static String maxPrimeFactor(double num){
 		double toReturn=num;
 		//nb: to check for prime factors you only need to check up to the square root of the number
 		for(int i=1;i<Math.sqrt(num);i++){
 			if(num%i==0&&isPrime(i)){
 				toReturn=i;

 			}
 		}
 		
 		String commaAnswer=String.format("%,f",toReturn);
 		String commaNum=String.format("%,f",num);
 		return("The largest prime factor of "+commaNum+" is "+commaAnswer);
 	}

}