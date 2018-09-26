public class ProjectEulerP6{
 public static void main(String[] args){
 	System.out.println(diffSquares(100));
 }
 //Problem 6: gives the diff btwn the sum of the squares of the 1st n #s & the square of the sum
 	public static String diffSquares(int n){
 		int sumSquares=0;
 		int squareSum=0;
 		for(int i=1;i<=n;i++){
 			sumSquares+=i*i;
 		}
 		for(int i=1;i<=n;i++){
 			squareSum+=i;
 		}
 		squareSum*=squareSum;
 		int diff=squareSum-sumSquares;

 		return "The difference in the sum of squares and the square of the sum is "+String.format("%,d",diff);

 	}
}