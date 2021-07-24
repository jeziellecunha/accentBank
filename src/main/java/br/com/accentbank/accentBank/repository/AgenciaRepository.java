package br.com.accentbank.accentBank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.accentbank.accentBank.model.Agencia;


@Repository
public interface AgenciaRepository  extends JpaRepository<Agencia, Long> {

}
