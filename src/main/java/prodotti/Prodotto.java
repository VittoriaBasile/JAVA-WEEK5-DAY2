package prodotti;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Prodotto {
	private String nome;
	private double prezzo;
}
