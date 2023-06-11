package br.com.univates.citymobileapi.controller;

import br.com.univates.citymobileapi.dto.RouteForm;
import br.com.univates.citymobileapi.mapper.RouteMapper;
import br.com.univates.citymobileapi.model.Alert;
import br.com.univates.citymobileapi.model.Route;
import br.com.univates.citymobileapi.repository.AlertRepository;
import br.com.univates.citymobileapi.repository.RouteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping("/api/routes")
public class RouteController {

    private final RouteRepository routeRepository;
    private final AlertRepository alertRepository;
    private final RouteMapper routeMapper;

    @GetMapping
    public ResponseEntity<List<Route>> findAll() {
        System.out.println("find all");
        List<Route> routes = routeRepository.findAll();
        for (Route route : routes) {
            if (route.getPositions() == null) {
                route.setPositions(Collections.emptyList());
            }
            if (route.getAlerts() == null) {
                route.setAlerts(Collections.emptySet());
            }
        }
        return ResponseEntity.ok(routes);
    }

    @PostMapping
    public ResponseEntity<Route> save(@RequestBody RouteForm routeForm) {
        System.out.println("save");
        Route route = routeMapper.map(routeForm);
        Set<Alert> alerts = route.getAlerts();
        route = routeRepository.save(route);
        for (Alert alert : alerts) {
            alert.setRoute(route);
            alertRepository.save(alert);
        }
        route.setAlerts(alerts);
        return ResponseEntity.ok(route);
    }


}
