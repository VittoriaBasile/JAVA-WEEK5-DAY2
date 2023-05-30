package prodotti;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnanasExtra extends IngredientiExtraDecorator {

	public AnanasExtra(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getPrezzo() {

		return pizza.getPrezzo() + 0.50;
	}

	@Override
	public long getCalorie() {

		return pizza.getCalorie() + 100;
	}

	@Override
	public String getIngredientiBase() {

		return pizza.getIngredientiBase() + " , ananas";
	}

	@Override
	public String getNome() {
		return "Hawaiiana";
	}

	@Override
	public String toString() {
		return "Nome pizza=" + getNome() + ", Prezzo()=" + getPrezzo() + ", Calorie()=" + getCalorie()
				+ ", Ingredienti=" + getIngredientiBase();
	}

}
