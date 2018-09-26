import java.*;
public class ProjectEulerP4 extends EulerHelpers{
 	public static void main(String[] args){
 		System.out.println(isPal(2002));
 		System.out.println(isPal(20102));
 		System.out.println(isPal(2072));
 		System.out.println(largestPal(3));
 }

 //Problem 4: gives the largest palindrome made from the product of 2 n-digit #s
 	public static String largestPal(int n){
 		int largest=0;
 		for(int i=(int)Math.pow(10,n-1);i<Math.pow(10,n)/2;i++){
 			for(int j=(int)Math.pow(10,n)/2;j<Math.pow(10,n);j++){
 				int ij=i*j;
 				if(isPal(ij)&&ij>largest){
 					largest=ij;
 				}
 			}
 		}
 		return "The largest palindrome multiple is "+String.format("%,d",largest);
 	}


}