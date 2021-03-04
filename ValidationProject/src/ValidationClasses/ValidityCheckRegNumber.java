package ValidationClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidityCheckRegNumber {

	//Method to validate if users input is a valid reg number 
	public Boolean checkIfValidRegNumber (String carNumber) {
		
		//Set return value to false
		Boolean isRegNbr = false;
		
		//Use Matcher to see that reg nbr contains 2 or 3 letters and 2 or 3 numbers, eg. BCA 123 or BC1 342
		Matcher m = Pattern.compile("[A-Z][A-Z]([A-Z]|\\d)\\d\\d").matcher(carNumber); 
		
		//Check if input matches m (matcher) and is 6 characters long
		if (m.find() && carNumber.length()==6) { 
		
			isRegNbr = true;
		}
	
		return isRegNbr;
	}
}
