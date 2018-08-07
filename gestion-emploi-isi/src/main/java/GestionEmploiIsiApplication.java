

import org.sid.dao.departementRepository;
import org.sid.entities.departement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;





//@EntityScan("<package with entities>")
@SpringBootApplication
public class GestionEmploiIsiApplication implements CommandLineRunner{

    @Autowired
    private departementRepository departementRepository;
	public static void main(String[] args) {
		SpringApplication.run(GestionEmploiIsiApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	departement e1=departementRepository.save( new departement((long) 123654,"ams"));
	}

}
