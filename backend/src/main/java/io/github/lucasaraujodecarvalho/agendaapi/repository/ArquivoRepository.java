package io.github.lucasaraujodecarvalho.agendaapi.repository;

import io.github.lucasaraujodecarvalho.agendaapi.entity.Arquivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArquivoRepository extends JpaRepository<Arquivo, Integer> {
}
