
public class HorseBarn {
	private Horse[] spaces;
	public HorseBarn(int size) {
		spaces = new Horse[size];
	}
	public void add(Horse h) {
		for(int i = 0; i < spaces.length; i++)
			if (spaces[i] == null) {
				spaces[i] = h;
				return;
			}
	}
	public void remove(Horse h) {
		for(int i = 0; i < spaces.length; i++)
			if (spaces[i].getName().equals(h.getName())) {
				spaces[i] = null;
			return;
			}
	}
	public int findHorseSpace(String name) {
		for(int i = 0; i < spaces.length; i++)
			if (spaces[i].getName().equals(name)) 
				return i;
		return -1;
	}
	public void consolidate(){
		Horse[] newSpaces = new Horse[spaces.length];
		int j = 0;
		for (Horse h: spaces)
			if (h != null)
				newSpaces[j++] = h;
		spaces = newSpaces;
	}
	public String toString() {
		String result = "";
		for (Horse h:spaces)
			result += h + " ";
		return result;
	}
	public static void main(String[] args) {
		HorseBarn hb = new HorseBarn(10);
		hb.add(new Horse("Abe", 100));
		hb.add(new Horse("Bob", 100));
		hb.add(new Horse("Cain", 100));
		hb.add(new Horse("Dan", 100));
		System.out.println(hb);
		System.out.println(hb.findHorseSpace("Bob"));
		hb.remove(new Horse("Abe", 100));
		System.out.println(hb);
		hb.consolidate();
		System.out.println(hb);
	}
	
}