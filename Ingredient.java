public class Ingredient {
	private String name, measuringUnit;
	private int caloriesPerUnit;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeasuringUnit() {
		return measuringUnit;
	}
	public void setmeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}
	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	public void setCaloriesPerUnit(int caloriesPerUnit) {
		this.caloriesPerUnit = caloriesPerUnit;
	}
	public String toString() {
		return name;
	}
	public boolean equals(Object o) {
		if (o instanceof Ingredient) {
			Ingredient ingredient = (Ingredient)o;
			return ingredient.name.equals(name)
					&& ingredient.measuringUnit.equals(measuringUnit)
					&& ingredient.caloriesPerUnit == caloriesPerUnit;
		}
		return false;
	}
	
}
