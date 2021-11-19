
public class UndergraduateApplicant extends CollegeApplicant {
	private int sat;
	private double gpa;
	
	public UndergraduateApplicant(String name, String college, int sat, double gpa) {
		super(name, college);
		this.sat = sat;
		this.gpa = gpa;
	}
	public int getSat() {
		return sat;
	}
	public double getGpa() {
		return gpa;
	}
	public String toString() {
		return "Name: " + getName() + "College: " + getCollege() + "SAT: " + getSat() + "GPA: " + getGpa();
	}
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else
			return false;
	}
}
