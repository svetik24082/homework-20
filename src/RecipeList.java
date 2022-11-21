import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Список рецептов: ").append('\n');
        for (Recipe recipe : this.recipes) {
            stringBuilder.append(recipe).append('\n');
        }
        return stringBuilder.toString();
    }

    public void addRecipe(Recipe recipe, Product product) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException(" Такой рецепт уже существует");
        } else {
            recipes.add(recipe);

        }
    }
}
