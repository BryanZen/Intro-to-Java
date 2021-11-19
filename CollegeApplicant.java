
public abstract class CollegeApplicant {
	private String name, college;
	
	public CollegeApplicant(String name, String college) {
		this.name = name;
		this.college = college;
	}
	public String getName() {
		return name;
	}
	public String getCollege() {
		return college;
	}
	public abstract String toString();
	
	public abstract boolean equals(Object o);

}
