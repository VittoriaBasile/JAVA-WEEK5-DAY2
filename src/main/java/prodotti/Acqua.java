package prodotti;

public class Acqua extends Drink {
	public Acqua() {
		super();
		setNome("Acqua");
		setPrezzo(1.80);
		setCalorie(10);
	}

	@Override
	public String toString() {
		return "Nome()= " + getNome() + ", Prezzo()= " + getPrezzo() + "Calorie= " + getCalorie();
	}
}
