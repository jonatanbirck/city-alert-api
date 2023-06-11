package br.com.univates.citymobileapi.repository;

import br.com.univates.citymobileapi.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}
