
public class Main {

	public static void main(String[] args) {
		
//perfect numbers are equal to the sum of their divisors
		//example:6->1,2,3
		int total=0;
		int num=28;
		            for (int i=1;i<num;i++) {
		              if (num%i==0) {
		            	 total+=i;           }}
		              System.out.println(total);
		              
		   if(total==num){
		    System.out.println("This number is a perfect number");
		    	  return;
		      }else {		  
		    	  
		    	  System.out.println("This number isn't a perfect number");
		    	  
		      }
		}
		
	}


