
public class Package {
	private String sender;
	private String recipient;
	private int cost = 0;
	private int distance;

	public Package(String sender,  String recipient, int distance) {
		this.sender = sender;
	    this.recipient = recipient;
		this.distance = distance;
	}
	public String getSender() {
		return sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public int getDistance() {
	    return distance;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost; 
	}
	public static int shippingCost(Package[] packages, int[] costSchedule) { 
		int totalCost = 0;
		for (int i = 0; i < packages.length; i++) {
			if (packages[i].getDistance() < 100)
				packages[i].setCost(costSchedule[0]);
			
			if (packages[i].getDistance() >= 100 && packages[i].getDistance() < 300)
				packages[i].setCost(costSchedule[1]);
			
			if (packages[i].getDistance() >= 300 && packages[i].getDistance() < 500)
				packages[i].setCost(costSchedule[2]);
			
			if (packages[i].getDistance() >= 500)
				packages[i].setCost(costSchedule[3]);
			
			totalCost += packages[i].getCost();
		}
		return totalCost;
			
	}
	
}
