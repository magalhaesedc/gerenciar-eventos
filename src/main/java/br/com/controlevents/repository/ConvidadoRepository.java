package br.com.controlevents.repository;

import br.com.controlevents.models.Convidado;
import br.com.controlevents.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);

}
