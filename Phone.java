
public class Phone {
	private String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public static String getDigits(String phoneNumber) {
		phoneNumber = phoneNumber.toLowerCase();
		phoneNumber = phoneNumber.replaceAll("-", "");
		phoneNumber = phoneNumber.replaceAll("-", "");
		phoneNumber = phoneNumber.replaceAll("a", "2");
		phoneNumber = phoneNumber.replaceAll("b", "2");
		phoneNumber = phoneNumber.replaceAll("c", "2");
		phoneNumber = phoneNumber.replaceAll("d", "3");
		phoneNumber = phoneNumber.replaceAll("e", "3");
		phoneNumber = phoneNumber.replaceAll("f", "3");
		phoneNumber = phoneNumber.replaceAll("g", "4");
		phoneNumber = phoneNumber.replaceAll("h", "4");
		phoneNumber = phoneNumber.replaceAll("i", "4");
		phoneNumber = phoneNumber.replaceAll("j", "5");
		phoneNumber = phoneNumber.replaceAll("k", "5");
		phoneNumber = phoneNumber.replaceAll("l", "5");
		phoneNumber = phoneNumber.replaceAll("m", "6");
		phoneNumber = phoneNumber.replaceAll("n", "6");
		phoneNumber = phoneNumber.replaceAll("o", "6");
		phoneNumber = phoneNumber.replaceAll("p", "7");
		phoneNumber = phoneNumber.replaceAll("q", "7");
		phoneNumber = phoneNumber.replaceAll("r", "7");
		phoneNumber = phoneNumber.replaceAll("s", "7");
		phoneNumber = phoneNumber.replaceAll("t", "8");
		phoneNumber = phoneNumber.replaceAll("u", "8");
		phoneNumber = phoneNumber.replaceAll("v", "8");
		phoneNumber = phoneNumber.replaceAll("w", "9");
		phoneNumber = phoneNumber.replaceAll("x", "9");
		phoneNumber = phoneNumber.replaceAll("y", "9");
		phoneNumber = phoneNumber.replaceAll("z", "9");
			
		return phoneNumber;	
	}
}
