package ma.aiac.exemplejpa.persistence;

import javax.persistence.*;

@Entity
@Table(name="aiac_people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false, name = "name_col")
    public String name;
}
