package ValidationClasses;



public class ValidityCheckNotNull {

	//Method to validate if users input is null
	public Boolean checkIfNull (Object object) {
	
		//Set return value to false
		Boolean isNull = false;
		
		//Check if input is null
		if (object == null) {
			isNull = true;
		}
		
		return isNull;
	}
}
