package cursospringbootudemy.service;

import cursospringbootudemy.model.ServidorPublico;

import java.util.List;
import java.util.Optional;

public interface ServidorPublicoService {
    List<ServidorPublico> listAll();

    Optional<ServidorPublico> listByMatricula(long matircula);

}
