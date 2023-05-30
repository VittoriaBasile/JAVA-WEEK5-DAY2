package prodotti;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pizza extends Consumation {

	private String ingredientiBase;

	public Pizza() {
		super();
		setNome("Margerita");
		setPrezzo(2.50);
		setCalorie(1104);
		setIngredientiBase("pomodoro, mozzarella");
	}

	@Override
	public String toString() {
		return "Nome pizza=" + getNome() + ", Prezzo()=" + getPrezzo() + ", Calorie()=" + getCalorie()
				+ ", Ingredienti=" + getIngredientiBase();
	}
}
