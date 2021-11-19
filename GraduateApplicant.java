
public class GraduateApplicant extends CollegeApplicant {
	private String originCollege;
	
	public GraduateApplicant(String name, String college, String originCollege) {
		super(name, college);
		this.originCollege = originCollege;
	}
	public String getOriginCollege() {
		return originCollege;
	}
	public String collegeMatch(String college, String originCollege) {
		college.toLowerCase();
		college.replaceAll(" ", "");
		originCollege.toLowerCase();
		originCollege.replaceAll(" ", "");
		
		if (college.equals(originCollege)) {
			return "from inside";
		} else 
			return "from outside";
	}
	public String toString() {
		return "Name: " + getName() + "College: " + getCollege() + "Original College: " + getOriginCollege();
	}
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else
			return false;
	}
}
