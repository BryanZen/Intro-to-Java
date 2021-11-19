
public class PackageTest {

	public static void main(String[] args) {
		Package[] packages1 = {new Package("Monmouth", "Appleby", 144), 
				new Package("Larkinge", "Ballachulish", 65), 
		        new Package("Malrton", "Auchtermuchty", 872), 
		        new Package("Monmouth", "Anghor Thom", 937)};
		int[] costSchedule1 = {10, 16, 37, 49};
		System.out.println(Package.shippingCost(packages1, costSchedule1));

	}

}
