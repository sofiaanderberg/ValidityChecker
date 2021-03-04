package ValidationClasses;


public class ValidityCheckSsn {
	

	//Method to validate if users input is a valid ssn by using Luhn algorithm
	public Boolean checkIfValidSsn (String socialSecurityNumber) {
		
		//Remove dash
		String ssn = socialSecurityNumber.replaceAll("\\D", "");
		
		//Set return value + last number of ssn to later compare with
		Boolean isSsn = false; 
		char nbr = ssn.charAt(11);
		int lastNumber = Character.getNumericValue(nbr);
		
		

		//Set sum of numbers to 0
		int sum = 0;
		
		//Loop through numbers in string, not first two numbers and not last control nbr
		for (int i = 2; i<11;i++) {
			
			//Convert char to int so they can be added to controlSum
			char ssnchar = ssn.charAt(i);
			int ssnNumber = Character.getNumericValue(ssnchar);
			
			//Check if i is an even number. Eg. If i = 2, it should be multiplied by two
			if (i%2 == 0) {
				int ssnMultiply = multiplyByTwo(ssnNumber);
				sum += ssnMultiply;
			}
			//If i is an odd number
			else {
				sum += ssnNumber;
				
			} 
				
			}
		
		//Count control number 
		int controlNumber = (10 - sum%10)%10;
	
		
		//Compare last number in ssn with control number and set boolean to true
		if (lastNumber == controlNumber){
			isSsn = true;
		}
		
		
	return isSsn;
		
	}

	//Method that multiplies number by two and if number has 2 numbers, eg.14, add 1+4
	public int multiplyByTwo(int number) {
		
		int nbr = number*2;
		
		int firstNumber = nbr/10;
		
		//Get second number (4) if number is 14
		int secondNumber = nbr%10;
		
		//Count sum of both numbers
		int sum = firstNumber+secondNumber;
		
		
		return sum;
				
	}
	
	

}
