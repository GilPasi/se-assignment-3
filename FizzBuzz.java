package assignment3_;

public class FizzBuzz {

	StringBuilder str = new StringBuilder();
	
	public String calculateFizzBuzz(int i) {
		
		for (int j=1; j<=i; j++) {
			if (j %3 ==0 && j%5 ==0)
				str.append("FizzBuzz");
			
			else if(j % 3 ==0)
				str.append("Fizz");
			
			else if ( j % 5==0)
				str.append("Buzz");
			
			else
				str.append(j);
			
			str.append(", ");
		}	
		
		return str.substring(0, str.length()-2);
	}


}


