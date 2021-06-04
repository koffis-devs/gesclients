package ci.koffis.gesclients;

import ci.koffis.gesclients.entity.Client;
import ci.koffis.gesclients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GesclientsApplication implements CommandLineRunner{

	@Autowired
	ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(GesclientsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client client = new Client(null, "koffi", "stevens", null, "koffistevens.g@gmail.com");
		Client client2 = new Client(null, "koffi", "stephane", null, "koffindastephane.g@gmail.com");
		clientRepository.save(client);
		clientRepository.save(client2);
	}
}
