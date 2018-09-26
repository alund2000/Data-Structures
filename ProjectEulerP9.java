public class ProjectEulerP9{
	public static void main(String[] args){

		System.out.println(pythagTriplet(1000));

 }
 //Problem 9: gives a pythagorean triplet in which a+b+c=sum and returns a*b*c
 	public static String pythagTriplet(double sum){
 		double product=1;
 		for(int a=1;a<sum;a++){
 			double aSquare=a*a;
 			for(int b=1;b<sum;b++){
 				double bSquare=b*b;
 				double cSqaure=aSquare+bSquare;
 				double c=Math.sqrt(cSqaure);
 				//determine if c is a perfect square & a+b+c=sum
 				if(c%1==0&&a+b+c==sum){
 					product=(a*b*c);
 				}
 			}
 		}
 		return "The product of the pythagorean triplet that sums to "+sum+" is "+String.format("%,f",product);
 	}

}