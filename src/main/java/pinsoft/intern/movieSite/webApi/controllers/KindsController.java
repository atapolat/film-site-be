package pinsoft.intern.movieSite.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import pinsoft.intern.movieSite.business.abstracts.KindService;
import pinsoft.intern.movieSite.business.requests.CreateKindRequest;
import pinsoft.intern.movieSite.business.responses.GetAllKindsResponse;


import java.util.List;

@RestController
@RequestMapping("/api/kinds")
public class KindsController {

    private KindService kindService;

    @Autowired
    public KindsController(KindService kindService) {

        this.kindService = kindService;
    }

    @GetMapping("/getall")
    public List<GetAllKindsResponse> getAll(){
        return kindService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateKindRequest createKindRequest){
        this.kindService.add(createKindRequest);
    }
}
