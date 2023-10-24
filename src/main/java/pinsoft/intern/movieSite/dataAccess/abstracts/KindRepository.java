package pinsoft.intern.movieSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import pinsoft.intern.movieSite.entities.concretes.Kind;

public interface KindRepository extends JpaRepository<Kind, Integer> {

}
