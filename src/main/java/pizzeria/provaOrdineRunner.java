package pizzeria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import configuration.BeansConfiguration;
import lombok.extern.slf4j.Slf4j;
import ordini.Ordine;
import ordini.StatoTavolo;
import ordini.Tavolo;
import prodotti.Acqua;
import prodotti.AnanasExtra;
import prodotti.Cartolina;
import prodotti.Pizza;
import prodotti.Prodotto;
import prodotti.ProsciuttoExtra;
import prodotti.SalamePiccanteExtra;
import prodotti.Spigolata;
import prodotti.Spilletta;
import prodotti.Sprite;
import prodotti.StatoOrdine;

@Slf4j
@Component
public class provaOrdineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		ordine();

	}

	public static void ordine() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		System.out.println("  ");

		System.out.println("**************PIZZE**************");
		System.out.println("  ");

		Pizza pizza1 = (Pizza) ctx.getBean("margherita");
		System.out.println(pizza1.toString());
		Spigolata pizza2 = (Spigolata) ctx.getBean("spigolata");
		System.out.println(pizza2.toString());
		SalamePiccanteExtra pizza3 = (SalamePiccanteExtra) ctx.getBean("diavola");
		System.out.println(pizza3.toString());
		ProsciuttoExtra pizza4 = (ProsciuttoExtra) ctx.getBean("prosciuttoExtra");
		System.out.println(pizza4.toString());
		AnanasExtra pizza5 = (AnanasExtra) ctx.getBean("hawaiiana");
		System.out.println(pizza5.toString());
		System.out.println("  ");

		System.out.println("**************BIBITE**************");
		System.out.println("  ");

		Acqua bibita1 = (Acqua) ctx.getBean("acqua");
		System.out.println(bibita1.toString());

		Sprite bibita2 = (Sprite) ctx.getBean("sprite");
		System.out.println(bibita2.toString());

		System.out.println("  ");

		System.out.println("**************GADGET**************");
		System.out.println("  ");

		Spilletta spilletta1 = (Spilletta) ctx.getBean("spilletta");
		System.out.println(spilletta1);

		Cartolina cartolina1 = (Cartolina) ctx.getBean("cartolina");
		System.out.println(cartolina1);

		System.out.println("  ");

		System.out.println("**************PROVA ORDINE**************");
		System.out.println("  ");

		List<Prodotto> lista1 = new ArrayList<>();
		lista1.add(spilletta1);
		lista1.add(pizza1);
		lista1.add(pizza3);

		Tavolo tavolo1 = new Tavolo(2, 4, StatoTavolo.OCCUPATO);
		Ordine ordine1 = new Ordine(1, tavolo1, lista1, StatoOrdine.INCORSO, 2, LocalDateTime.of(2023, 05, 30, 12, 30));
		log.info(ordine1.toString());

		ctx.close();
	}

}
