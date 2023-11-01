package pinsoft.intern.movieSite.filmAdd.Repository;

import pinsoft.intern.movieSite.filmAdd.Entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository  extends JpaRepository<Film,Long> {
}
