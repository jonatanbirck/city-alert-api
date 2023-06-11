package br.com.univates.citymobileapi.model;

import br.com.univates.citymobileapi.util.LatLng;
import br.com.univates.citymobileapi.util.LatLngFieldConverter;
import br.com.univates.citymobileapi.util.ListLatLngFieldConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(columnDefinition = "TEXT")
    @Convert(converter = ListLatLngFieldConverter.class)
    private List<LatLng> positions;

    @OneToMany(mappedBy="route")
    private Set<Alert> alerts;

    @Column(columnDefinition = "TEXT")
    @Convert(converter = LatLngFieldConverter.class)
    private LatLng startPosition;

    @Column(columnDefinition = "TEXT")
    @Convert(converter = LatLngFieldConverter.class)
    private LatLng endPosition;

}
