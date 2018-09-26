public class ProjectEulerP5{
	public static void main(String[] args){
		System.out.println(smallestEvenlyDivis(20));
 }
 //Problem 5: gives the smallest number evenly divisible by 1 to ceiling
 	public static String smallestEvenlyDivis(int ceiling){
 		int toSave=0;
 		for(int i=2520;i>0;i++){
 			for(int j=1;j<=ceiling;j++){
 				if(i%j!=0){
 					break;
 				}else if(i%j==0&&j==ceiling){
 					toSave=i;
 					break;
 				}
 			}
 			if(toSave>0){
 				break;
 			}
 		}
 		return "The smallest evenly divisible number is "+String.format("%,d",toSave);
 	}
 	
}