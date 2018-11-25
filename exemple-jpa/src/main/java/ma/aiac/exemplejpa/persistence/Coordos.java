package ma.aiac.exemplejpa.persistence;

import javax.persistence.*;

@Entity
public class Coordos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String email;
    public String phone;

    @OneToOne
    public Person person;
}
