package ma.aiac.exemplejpa;

import ma.aiac.exemplejpa.persistence.Coordos;
import ma.aiac.exemplejpa.persistence.CoordosRepository;
import ma.aiac.exemplejpa.persistence.PeopleRepository;
import ma.aiac.exemplejpa.persistence.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Component
public class ExempleJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExempleJpaApplication.class, args);
	}

	@Autowired
	PeopleRepository peopleRepository;

	@Autowired
	CoordosRepository coordosRepository;

	@Override
	public void run(String... args) throws Exception {
//		Person p = new Person();
//		p.name = "person 2";
//		peopleRepository.save(p);

//		Optional<Person> byId = peopleRepository.findById(1L);
//		if(byId.isPresent()) {
//			System.out.println("name:"+byId.get().name);
//		}
//
//		List<Person> all = peopleRepository.findAll();
//		System.out.println("size:"+all.size());
//
//
//		List<Person> byName = peopleRepository.findByName("person 1");
//		System.out.println("size by name:"+byName.size());
//
//		List<Person> byName2 = peopleRepository.findPeopleByName("person 2");
//		System.out.println("size by name 2:"+byName2.size());

//		Person person = peopleRepository.findById(1L).get();
//		Coordos coordos = new Coordos();
//		coordos.email = "bla bla";
//		coordos.phone = "bla bla bla";
//		coordos.person = person;
//
//		coordosRepository.save(coordos);

		Coordos coordos = coordosRepository.findById(4L).get();
		System.out.println("Name coordo "+coordos.person.name);

		List<Coordos> byPersonName = coordosRepository.findByPersonName("person 1");
		System.out.println("Coordo by name:"+byPersonName.size());
	}
}
