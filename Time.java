
public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public void tick() {
		setSeconds(getSeconds() + 1);
		if (getSeconds() >= 60) {
			setMinutes(getMinutes() + 1);
			setSeconds(0);
			if (getMinutes() >= 60) {
				setHours(getHours() + 1);
				setMinutes(0);
				if (getHours() >= 24) {
					setHours(0);
				}
			}
		}
	}
	public void add(Time offset) {
		int counter = offset.getSeconds() + (60 * offset.getMinutes()) + (3600 * offset.getHours());
		for (int i = 0; i < counter; i++) {
			tick();
		}
	}
}
