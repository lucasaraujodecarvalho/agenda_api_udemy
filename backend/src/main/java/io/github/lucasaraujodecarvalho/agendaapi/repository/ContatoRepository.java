package io.github.lucasaraujodecarvalho.agendaapi.repository;

import io.github.lucasaraujodecarvalho.agendaapi.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
