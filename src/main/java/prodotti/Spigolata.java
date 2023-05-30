package prodotti;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spigolata extends Pizza {
	public Spigolata() {
		setNome("Spigolata");
		setPrezzo(getPrezzo() * 2);
		setCalorie(getCalorie() * 2);
		getIngredientiBase();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
