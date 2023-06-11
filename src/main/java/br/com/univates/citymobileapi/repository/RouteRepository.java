package br.com.univates.citymobileapi.repository;

import br.com.univates.citymobileapi.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
