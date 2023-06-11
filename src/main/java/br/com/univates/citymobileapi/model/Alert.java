package br.com.univates.citymobileapi.model;

import br.com.univates.citymobileapi.util.LatLng;
import br.com.univates.citymobileapi.util.LatLngFieldConverter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "alerts")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 500000)
    private String photo; //base64

    @Column(columnDefinition = "TEXT")
    @Convert(converter = LatLngFieldConverter.class)
    private LatLng position;

    @ManyToOne
    @JoinColumn(name="route_id")
    @JsonIgnore
    private Route route;

    private Type type;

    private String observation;

    public enum Type {
        TRASH,
        DIRTY_PLACE,
        BROKEN_GLASS,
        ANIMAL_WASTE
    }

}
