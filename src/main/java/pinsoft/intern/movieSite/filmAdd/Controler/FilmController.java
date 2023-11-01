package pinsoft.intern.movieSite.filmAdd.Controler;

import pinsoft.intern.movieSite.filmAdd.Entity.Film;
import pinsoft.intern.movieSite.filmAdd.Service.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/film-mania")
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/films")
    public List<Film> getFilms(){
        return filmService.getFilms();
    }

    @PostMapping
    public String addFilm(@RequestBody Film film){
        return filmService.addFilm(film);
    }
}
