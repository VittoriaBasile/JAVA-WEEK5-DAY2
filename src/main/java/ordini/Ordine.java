package ordini;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import prodotti.Prodotto;
import prodotti.StatoOrdine;

@Getter
@Setter
@ToString
@Component
//@PropertySource("classpath:application.properties")

public class Ordine {
	private int numeroOrdine;
	private Tavolo tavolo;
	private List<Prodotto> comanda;
	private StatoOrdine statoOrdine;
	private int coperti;
	private LocalDateTime oraAcquisizione;
	// @Value("${pizzeria.costoCoperto}")
	private double costoCoperto;
	private double importoTotale;

	public Ordine(int numeroOrdine, Tavolo tavolo, List<Prodotto> comanda, StatoOrdine statoOrdine, int coperti,
			LocalDateTime oraAcquisizione) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.tavolo = tavolo;
		this.comanda = comanda;
		this.statoOrdine = statoOrdine;
		this.coperti = coperti;
		this.oraAcquisizione = oraAcquisizione;
		setCostoCoperto(coperti * 2.00);
		setImportoTotale(totale(comanda) + getCostoCoperto());
	}

	public double totale(List<Prodotto> lista) {
		double tot;

		tot = lista.stream().mapToDouble(Prodotto::getPrezzo).sum();
		;
		return tot;
	}
}
