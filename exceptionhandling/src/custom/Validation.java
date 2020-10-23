package custom;

public class Validation {
	
	public boolean isValidAge(int age) throws BussinessCheckedException {
		
		if(age <=0) {
			
			throw new BussinessCheckedException("Age can't be zero or -ve");
		}
		
		if(age <19 || age >40) {
			throw new BussinessCheckedException("Age should be between 19 and 40");
		}
		
		return true;
	}
	
	
	// checked mobile number
	
	public boolean isValidMobileNumber(String mobile) throws BussinessCheckedException {
		
		if(!mobile.matches("\\+1-[0-9]{10}")) {
			 throw new BussinessCheckedException("Entered mobile num " + mobile + "is Invalid");
		}
		
		return true;
	}

}
