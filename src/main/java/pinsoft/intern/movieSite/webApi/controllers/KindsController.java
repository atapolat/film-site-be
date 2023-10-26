package pinsoft.intern.movieSite.webApi.controllers;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pinsoft.intern.movieSite.business.abstracts.KindService;
import pinsoft.intern.movieSite.business.requests.CreateKindRequest;
import pinsoft.intern.movieSite.business.requests.UpdateKindRequest;
import pinsoft.intern.movieSite.business.responses.GetAllKindsResponse;
import pinsoft.intern.movieSite.business.responses.GetByIdKindResponse;


import java.util.List;

@RestController
@RequestMapping("/api/kinds")
@AllArgsConstructor
public class KindsController {

    private KindService kindService;

    @GetMapping()
    public List<GetAllKindsResponse> getAll(){
        return kindService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdKindResponse getById(@PathVariable int id){
        return kindService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateKindRequest createKindRequest){
        this.kindService.add(createKindRequest);
    }

    @PutMapping
    public void update(@RequestBody() UpdateKindRequest updateKindRequest) {
        this.kindService.update(updateKindRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.kindService.delete(id);
    }
}
