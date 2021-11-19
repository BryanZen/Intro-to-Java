import java.util.ArrayList;

public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> recipies = new ArrayList<CookingRecipe>();
	
	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public ArrayList<CookingRecipe> getRecipes(){
		return recipies;
	}
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for (CookingRecipe c:recipies)
			if (c.getName().equals(name))
				return null;
		CookingRecipe recipe = new CookingRecipe(name);
		for (RecipeIngredient r:ingredients)
			recipe.addOrUpdateRecipeIngredient(r, r.getQuantity());
		recipies.add(recipe);
		return recipe;
	}
	public CookingRecipe removeRecipe(String name) {
		for (CookingRecipe c:recipies)
			if (c.getName().equals(name)) {
				recipies.remove(c);
				return c;
			}
		return null;
	}
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		ArrayList<CookingRecipe> result = new ArrayList<CookingRecipe>();
		for (CookingRecipe c:recipies)
			if (c.containsAllIngredients(ingredients))
				result.add(c);
		CookingRecipe[] a = new CookingRecipe[result.size()];
		for (int i = 0; i < result.size(); i++)
			a[i] = result.get(i);
		return a;
	}
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		ArrayList<CookingRecipe> result = new ArrayList<CookingRecipe>();
		for (CookingRecipe c:recipies)
			if (c.getIngredients().size() <= numberOfIngredients)
				result.add(c);
		CookingRecipe[] a = new CookingRecipe[result.size()];
		for (int i = 0; i < result.size(); i++)
			a[i] = result.get(i);
		return a;
	}
	public CookingRecipe[] findRecipesLowCalories() {
		float minCals = recipies.get(0).calculateCalories();
		for (CookingRecipe c:recipies)
			if (c.calculateCalories() < minCals)
				minCals = c.calculateCalories();
		ArrayList<CookingRecipe> result = new ArrayList<CookingRecipe>();
		for (CookingRecipe c:recipies)
			if (c.calculateCalories() == minCals)
				result.add(c);
		CookingRecipe[] a = new CookingRecipe[result.size()];
		for (int i = 0; i < result.size(); i++)
			a[i] = result.get(i);
		return a;
	}
	public String toString() {
		String result = "Book: " + bookName + ":\n";
		for (CookingRecipe c:recipies)
			result += " " + c.toString() + "\n";
		return result;
	}
	public boolean equals(Object o) {
		if (o instanceof RecipeBook)
			return ((RecipeBook)o).getBookName().equals(bookName)
					&& CookingRecipe.setEquality(recipies, ((RecipeBook)o).recipies);
		return false;
	}
	
}