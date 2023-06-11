package br.com.univates.citymobileapi.mapper;

import br.com.univates.citymobileapi.dto.AlertForm;
import br.com.univates.citymobileapi.dto.RouteForm;
import br.com.univates.citymobileapi.model.Alert;
import br.com.univates.citymobileapi.model.Route;
import br.com.univates.citymobileapi.util.MockObjects;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RouteMapper {

    public Route map(RouteForm form) {
        Route route = new Route();
        route.setName(form.getName());
        route.setPositions(form.getPositions());
        route.setStartPosition(form.getStartPosition());
        route.setEndPosition(form.getEndPosition());
        route.setAlerts(form.getAlerts().stream().map(this::map).collect(Collectors.toSet()));
        return route;
    }

    private Alert map(AlertForm form) {
        Alert alert = new Alert();
        alert.setType(form.getType());
        alert.setObservation(form.getObservation());
        alert.setPosition(form.getPosition());
        alert.setPhoto(form.getPhoto());
        return alert;
    }

}
