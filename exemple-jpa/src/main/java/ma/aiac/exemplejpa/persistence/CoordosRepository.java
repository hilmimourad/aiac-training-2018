package ma.aiac.exemplejpa.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoordosRepository extends JpaRepository<Coordos, Long> {

    List<Coordos> findByPersonName(String name);
}
