package cursospringbootudemy.service;

import com.fasterxml.jackson.core.type.TypeReference;
import cursospringbootudemy.model.ServidorPublico;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServidorPublicoServiceImp implements ServidorPublicoService{
    @Override
    public List<ServidorPublico> listAll() {
        TypeReference<List<ServidorPublico>> typeReference = new TypeReference<List<ServidorPublico>>(){};

    }

    @Override
    public Optional<ServidorPublico> listByMatricula(long matircula) {
        return Optional.empty();
    }
}
