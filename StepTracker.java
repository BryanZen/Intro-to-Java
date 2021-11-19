
public class StepTracker {
	private int minSteps;
	private int days;
	private int activeDays;
	private double totalSteps;
	
	public StepTracker() {
		this.minSteps = 0;
		this.days = 0;
		this.activeDays = 0;
		totalSteps = 0;
	}
	public StepTracker(int minSteps) {
		this.minSteps = minSteps;
	}
		
	public int addDailySteps(int steps) {
		days++;
		totalSteps += steps;
		if (steps >= minSteps)
			activeDays++;
		return activeDays;
	}
	public int activeDays() {
		return activeDays;
	}
	public double averageSteps() {
		if (days <= 0)
			return 0.0;
		return totalSteps/days;
	}
}
