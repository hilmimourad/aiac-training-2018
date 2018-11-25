package aiac.ma.exemplerest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("people")
public class PeopleController {

    @PostMapping("")
    public ResponseEntity<Person> savePerson(@RequestBody Person p) {

        System.out.println("Person to create:"+p);
        //ResponseEntity.status(HttpStatus.CREATED).build();
        return ResponseEntity.ok(p);
    }

    @GetMapping("")
    public List<Person> getPeople(@RequestParam String name, @RequestParam String email) {
        Person p = new Person();
        p.id = 1L;
        p.name = "name 1:"+name;

        Person p2 = new Person();
        p2.id = 2L;
        p2.name = "name 2:"+email;

        return Arrays.asList(p, p2);
    }

    @GetMapping("{id}")
    public ResponseEntity<Person> getById(@PathVariable  Long id) {
        Person p2 = new Person();
        p2.id = id;
        p2.name = "name 2";

        return ResponseEntity.ok(p2);
    }
}
