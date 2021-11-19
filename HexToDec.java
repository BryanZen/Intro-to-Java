
public class HexToDec {
	private int dec;
	private String hex;

	public int getDec() {
		return dec;
	}
	public String getHex() {
		return hex;
	}
	public void setDec(int dec) {
		this.dec = dec;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	public int parseHex(String hex) throws HexFormatException {
		int dec;
		setHex(hex);
		for (int i = 0; i < hex.length(); i++) {
			char ch = hex.charAt(i);
			if ((ch < '0' || ch > '9') && 
					(ch < 'A' || ch > 'F')) {
				dec = Integer.valueOf(hex, 16);
				setDec(dec);
			} else 
				throw new HexFormatException("This input is not a hexideciaml: " + hex);
		}
		return getDec();
	}
}

