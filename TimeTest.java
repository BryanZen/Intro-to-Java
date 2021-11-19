
public class TimeTest {

	public static void main(String[] args) {
		Time time = new Time(10,30,50);
		time.add(new Time(2,40,50));
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		time.tick();
		System.out.printf("Seconds: %d Minutes: %d Hours: %d", time.getSeconds(), time.getMinutes(), time.getHours());
	}

}
