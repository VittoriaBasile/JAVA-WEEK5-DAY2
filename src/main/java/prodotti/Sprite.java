package prodotti;

public class Sprite extends Drink {

	public Sprite() {
		super();
		setNome("Sprite");
		setPrezzo(2.50);
		setCalorie(375);
	}

	@Override
	public String toString() {
		return "Nome()= " + getNome() + ", Prezzo()= " + getPrezzo() + "Calorie= " + getCalorie();
	}

}
