package prodotti;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalamePiccanteExtra extends IngredientiExtraDecorator {

	public SalamePiccanteExtra(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return "Diavola";
	}

	@Override
	public double getPrezzo() {

		return pizza.getPrezzo() + 2.50;
	}

	@Override
	public long getCalorie() {

		return pizza.getCalorie() + 200;
	}

	@Override
	public String getIngredientiBase() {

		return pizza.getIngredientiBase() + " , salame piccante";
	}

	@Override
	public String toString() {
		return "Nome pizza=" + getNome() + ", Prezzo()=" + getPrezzo() + ", Calorie()=" + getCalorie()
				+ ", Ingredienti=" + getIngredientiBase();
	}

}
