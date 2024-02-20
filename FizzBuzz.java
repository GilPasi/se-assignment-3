package assignment3_;

public class FizzBuzz {

	public String calculateFizzBuzz(int i) {
		String result ="";
		for (int j =1; j<=i; j++) {
			if(j ==3)
				result += "Fizz";
			else if ( j ==5)
				result += "Buzz";
			else
				result += j;
			result += ", ";
		}
		result = result.substring(0,result.length()-2);
		System.out.println(result);
		return result;
	}

	

}


