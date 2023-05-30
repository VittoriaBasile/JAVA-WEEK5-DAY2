package ordini;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
	private int numeroTavolo;
	private int copertiMassimi;
	private StatoTavolo statoTavolo;

}
