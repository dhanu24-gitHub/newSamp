package customException;

public class FindEligibility {
	public static void main(String[] args) throws InvalidAgeException {
		int num = 16;
		if(num >= 18) {
			System.out.println(num + " is Eligible");
		}
		else {
			throw new InvalidAgeException("Not Eligible");
		}
	}

}
