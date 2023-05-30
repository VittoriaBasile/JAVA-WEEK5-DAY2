package prodotti;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Consumation {

	public Drink() {
		super();
	}

	@Override
	public String toString() {
		return "Nome()= " + getNome() + ", Prezzo()= " + getPrezzo() + "Calorie= " + getCalorie();
	}

}
