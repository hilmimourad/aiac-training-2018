package ma.aiac.exempleboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ExempleBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExempleBootApplication.class, args);
	}

	@Autowired
	A a;

	@Autowired
	B b;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(a.doSomething());
		System.out.println(b.doSomething());
	}
}
