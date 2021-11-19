import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>();
	
	public CookingRecipe(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<RecipeIngredient> getIngredients(){
		return ingredients;
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
		for (RecipeIngredient r:ingredients)
			if (r.getName().equals(ingredient.getName())) {
				r.setQuantity(quantity);
				return;
			}
		/*
		 for (int i = 0; i < ingredients.size(); i++)
			if (ingredients.get(i).getName().equals(ingredient.getName())) {
				ingredients.get(i).setQuantity(quantity);
				return;
			}
		*/
		ingredients.add(new RecipeIngredient(
				ingredient.getName(),
				ingredient.getMeasuringUnit(),
				ingredient.getCaloriesPerUnit(),
				quantity
			));
	}
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (RecipeIngredient r:ingredients)
			if (r.getName().equals(ingredient.getName()))
				return r;
		return null;
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for (RecipeIngredient r:ingredients)
			if (r.getName().equals(ingredientName))
				return r;
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		for (RecipeIngredient r:ingredients)
			if (r.getName().equals(ingredient.getName())) {
				ingredients.remove(r);
				return r;
			}
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		for (RecipeIngredient r:ingredients)
			if (r.getName().equals(ingredientName)) {
				ingredients.remove(r);
				return r;
			}
		return null;
	}
	public float calculateCalories() {
		float result = 0;
		for (RecipeIngredient r:ingredients)
			result += r.getQuantity() * r.getCaloriesPerUnit();
		return result;
	}
	public int getNumberOfIngredients() {
		return ingredients.size();
	}
	public String toString() {
		String result = name + ": ";
		for (RecipeIngredient r:ingredients)
			result += r.toString() + ", ";
		return result;
	}
	public boolean equals(Object o) {
		if (o instanceof CookingRecipe) {
			CookingRecipe c = (CookingRecipe)o;
			return c.name.equals(name) && setEquality(ingredients, c.ingredients);
		}
		return false;
	}
	public static boolean setEquality(ArrayList s1, ArrayList s2) {
		return subset(s1, s2) && subset(s2, s1);
	}
	public static boolean subset(ArrayList s1, ArrayList s2) {
		for (Object o:s1)
			if (!s2.contains(o))
				return false;
		return true;
	}
	public boolean containsAllIngredients(RecipeIngredient[] ingredients2){
		for (RecipeIngredient r:ingredients2) {
			boolean found = false;
			for (RecipeIngredient ingredient:ingredients)
				if (ingredient.getName().equals(r.getName())) {
					found = true;
					break;
				}
			if (!found)
				return false;
		}
		return true;
	}
}