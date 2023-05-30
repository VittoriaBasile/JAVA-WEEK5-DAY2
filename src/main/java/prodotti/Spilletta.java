package prodotti;

public class Spilletta extends Prodotto {

	public Spilletta() {
		super();
		setNome("Spilletta");
		setPrezzo(3.00);
	}

	@Override
	public String toString() {
		return "Spilletta [getNome()=" + getNome() + ", getPrezzo()=" + getPrezzo() + "]";
	}

}
