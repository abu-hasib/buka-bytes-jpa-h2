package payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(EmployeeRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Employee("Akinde Femi", "ceo")));
	      log.info("Preloading " + repository.save(new Employee("Justice Ade", "dev")));
	    };
	  }
}
