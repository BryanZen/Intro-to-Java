
public class TestRecipeBook {

	public static void main(String[] args) {
		RecipeBook julia = new RecipeBook("French Cooking");
		
		julia.addRecipe("soup", new RecipeIngredient[] {
			new RecipeIngredient("potatoes", "lb", 100, 2),	
			new RecipeIngredient("leaks", "lb", 20, 1),	
		});
		
		julia.addRecipe("bread", new RecipeIngredient[] {
			new RecipeIngredient("flour", "lb", 100, 2),	
			new RecipeIngredient("water", "lb", 0, 1),	
		});
		
		julia.addRecipe("omlete", new RecipeIngredient[] {
			new RecipeIngredient("eggs", "lb", 100, 2),	
		});
		
		//julia.removeRecipe("bread");
		
		CookingRecipe[] c1 = julia.findRecipes(new RecipeIngredient[] {
				new RecipeIngredient("flour", "lb", 100, 1)
		});
		for (CookingRecipe c: c1)
			System.out.println(c);
		
		CookingRecipe[] c2 = julia.findRecipesWithFewIngredients(2);
		for (CookingRecipe c: c2)
			System.out.println(c);
		
		CookingRecipe[] c3 = julia.findRecipesLowCalories();

		for (CookingRecipe c: c3)
			System.out.println(c);

	}

}
