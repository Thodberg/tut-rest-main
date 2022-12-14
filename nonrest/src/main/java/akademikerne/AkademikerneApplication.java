package akademikerne;

import akademikerne.domain.table.Brugere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AkademikerneApplication {

	private static Brugere principalUser;

	public static void setPrincipalUser(Brugere principalUser2) {
		principalUser = principalUser2;
	}

	public static Brugere getPrincipalUser() {
		return principalUser;
	}


	public static void main(String... args) {

		principalUser = new Brugere();
		principalUser.setBrugerid(3);
		SpringApplication.run(AkademikerneApplication.class, args)
		//repository.save(new Employee("Bilbo Baggins", "burglar");
		;
	}
}
