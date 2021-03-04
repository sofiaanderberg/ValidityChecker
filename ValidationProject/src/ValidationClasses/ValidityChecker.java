package ValidationClasses;

public class ValidityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidityCheckSsn validityCheckSsn = new ValidityCheckSsn();
		
		Boolean ssnOrNot = validityCheckSsn.checkIfValidSsn("19960902-4865");
		
		System.out.println(ssnOrNot);
		

	

}
}
