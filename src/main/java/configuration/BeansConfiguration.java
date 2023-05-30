package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prodotti.Acqua;
import prodotti.AnanasExtra;
import prodotti.Cartolina;
import prodotti.Pizza;
import prodotti.ProsciuttoExtra;
import prodotti.SalamePiccanteExtra;
import prodotti.Spigolata;
import prodotti.Spilletta;
import prodotti.Sprite;

@Configuration
public class BeansConfiguration {
	@Bean(name = "margherita")
	Pizza margherita() {
		return new Pizza();
	}

	@Bean(name = "spigolata")
	Spigolata spigolata() {
		return new Spigolata();
	}

	@Bean(name = "diavola")
	SalamePiccanteExtra diavola(Pizza margherita) {
		return new SalamePiccanteExtra(margherita);
	}

	@Bean(name = "prosciuttoExtra")
	ProsciuttoExtra prosciuttoExtra(Pizza margherita) {
		return new ProsciuttoExtra(margherita);
	}

	@Bean(name = "hawaiiana")
	AnanasExtra ananasExtra(Pizza margherita) {
		return new AnanasExtra(margherita);
	}

	@Bean(name = "spilletta")
	Spilletta spilletta() {
		return new Spilletta();
	}

	@Bean(name = "cartolina")
	Cartolina cartolina() {
		return new Cartolina();
	}

	@Bean(name = "sprite")
	Sprite sprite() {
		return new Sprite();
	}

	@Bean(name = "acqua")
	Acqua acqua() {
		return new Acqua();
	}
}
