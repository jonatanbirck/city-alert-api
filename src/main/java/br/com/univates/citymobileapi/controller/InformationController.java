package br.com.univates.citymobileapi.controller;

import br.com.univates.citymobileapi.model.Information;
import br.com.univates.citymobileapi.util.MockObjects;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/informations")
public class InformationController {

    @GetMapping
    public ResponseEntity<Information> findInformation() {
        return ResponseEntity.ok(MockObjects.getInformation());
    }

}
