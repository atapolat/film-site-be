package pinsoft.intern.movieSite.filmAdd.Service;

import pinsoft.intern.movieSite.filmAdd.Entity.Film;
import pinsoft.intern.movieSite.filmAdd.Repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {
    private final FilmRepository filmRepository;
    public List<Film> getFilms(){
        return filmRepository.findAll();
    }
    public String addFilm(Film film){
        filmRepository.save(film);
        return "Başarılı";
    }
}
