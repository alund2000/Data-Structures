import java.util.ArrayList;
public class ProjectEulerP2{
	public static void main(String[] args){

 }

  //Problem 2: gives the sum of the even Fibbonacci Values
 	public static String sumEvenFib(int ceiling){
 		int sum=0;
 		int twoAway=1;
 		int oneAway=2;
 		sum+=2;
 		while(oneAway<ceiling){
 			int next=twoAway+oneAway;
 			if(next%2==0){
 				sum+=next;
 			}
 			twoAway=oneAway;
 			oneAway=next;
 		}
 		String commaAnswer=String.format("%,d",sum);
 		return ("The sum of the even Fibbonacci numbers less than 4M is "+commaAnswer);	
 	}

}