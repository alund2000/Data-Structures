public class ProjectEuler{
	public static void main(String[] args){
		System.out.println(sumMultiples(1000));

 }


 //Problem 1: find the sum of all the multiples of 3 or 5 below a given #
	public static String sumMultiples(int ceiling){
		int sum=0;
		for(int i=0;i<ceiling;i++){
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		return("The sum of the multiples of 5 & 3 from 0 to "+ceiling+" is "+ sum);
	}
}