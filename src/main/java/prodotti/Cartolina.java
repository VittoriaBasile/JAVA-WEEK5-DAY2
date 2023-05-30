package prodotti;

public class Cartolina extends Prodotto {
	public Cartolina() {
		super();
		setNome("Cartolina");
		setPrezzo(1.00);
	}

	@Override
	public String toString() {
		return "Spilletta [getNome()=" + getNome() + ", getPrezzo()=" + getPrezzo() + "]";
	}

}
