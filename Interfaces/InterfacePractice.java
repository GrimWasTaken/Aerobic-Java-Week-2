class MealPrep implements Cooking
{
	boolean readRecipe = false;
	String food;
	
	public void cook()
	{
		if(this.readRecipe == true)
			System.out.println("The " + this.food + " has been cooked.");
			else 
			{
				System.out.println("Read the recipe first!");
			}
		
	}
	
	public void readRecipe()
	{
		readRecipe = true;
	}
}

class Meal extends MealPrep
{
	public void setMeal(String food)
	{
		this.food = food;
	}
}

public class InterfacePractice {

	public static void main(String[] args) {
		
		Meal mealPrep = new Meal();
		mealPrep.setMeal("Cake");
		mealPrep.cook();
		mealPrep.readRecipe();
		mealPrep.cook();
	}

}
