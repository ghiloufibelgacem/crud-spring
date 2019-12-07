package tn.enis.ghiloufi.compteAPP.util;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tn.enis.ghiloufi.compteAPP.entities.Client;
import tn.enis.ghiloufi.compteAPP.entities.Compte;
import tn.enis.ghiloufi.compteAPP.repositories.ClientRepository;
// import tn.enis.ghiloufi.compteAPP.repositories.CompteRepository;

@Component
public class LoadData implements CommandLineRunner {

	private ClientRepository clientRepository;
	// private CompteRepository compteRepository;

	public LoadData(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Compte c1, c2, c3, c4, c5;
		c1 = new Compte("x124", 200);
		c2 = new Compte("x125", 200);
		c3 = new Compte("x126", 200);
		c4 = new Compte("x127", 200);
		c5 = new Compte("x128", 200);

		Client clt1, clt2, clt3, clt4;

		clt1 = new Client("Belgacem", "Ghiloufi", "Sfax,Tunisie");
		clt1.addComptes(c1);
		clt2 = new Client("Belgacem", "Ghiloufi", "Sfax,Tunisie");
		clt2.addComptes(c2);
		clt3 = new Client("Belgacem", "Ghiloufi", "Sfax,Tunisie");
		clt3.addComptes(c3);
		clt4 = new Client("Belgacem", "Ghiloufi", "Sfax,Tunisie");
		clt4.addComptes(c4);
		clt4.addComptes(c5);

		Stream.of(clt1, clt2, clt3, clt4).forEach(client -> {
			clientRepository.save(client);
		});

	}

}
