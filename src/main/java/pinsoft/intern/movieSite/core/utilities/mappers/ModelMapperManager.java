package pinsoft.intern.movieSite.core.utilities.mappers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService{

    private ModelMapper modelMapper;

    @Override
    public ModelMapper forResponse() {
        return null;
    }

    @Override
    public ModelMapper forRequest() {
        return null;
    }
}
