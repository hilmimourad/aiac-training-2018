package ma.aiac.exemplejpa.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {

    List<Person> findByName(String name);

    @Query("SELECT p FROM Person p WHERE p.name= :name")
    List<Person> findPeopleByName(@Param("name") String name);

}
