
public class CollegeTest {

	public static void main(String[] args) {
		UndergraduateApplicant a = new UndergraduateApplicant("Ben Dover", "Stony Brook University", 1370, 3.75);
		GraduateApplicant b = new GraduateApplicant("Hue Mungus", "Stony Brook University", "New York University");
		GraduateApplicant c = new GraduateApplicant("Ling Ma", "New York University", "New York University");
		
		String b1 = b.collegeMatch("Stony Brook University", "New York University");
		System.out.println(b1);
		
		String c1 = c.collegeMatch("New York University", "New York University");
		System.out.println(c1);
	}

}
