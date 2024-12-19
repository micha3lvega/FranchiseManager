package co.com.accenture.nequi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.com.accenture.nequi.entity.Franchise;
import co.com.accenture.nequi.repository.IFranchiseRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class FranchiseManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FranchiseManagerApplication.class, args);
	}

	@Autowired
	private IFranchiseRepository franchiseRepository;

	@Override
	public void run(String... args) throws Exception {

		var franchise = new Franchise();
		franchise.setName("Accenture");

		franchise = franchiseRepository.save(franchise);
		log.info("franchise = {}", franchise);

	}

}
