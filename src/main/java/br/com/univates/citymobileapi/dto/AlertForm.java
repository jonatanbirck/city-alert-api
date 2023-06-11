package br.com.univates.citymobileapi.dto;

import br.com.univates.citymobileapi.model.Alert;
import br.com.univates.citymobileapi.util.LatLng;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlertForm {

    private String photo; //base64
    private LatLng position;
    private Alert.Type type;
    private String observation;

    public void setPosition(String position) {
        this.position = toLatLng(position);
    }

    private static LatLng toLatLng(String latLng) {
        latLng = latLng.replace("{", "");
        latLng = latLng.replace("}", "");
        String[] position = latLng.split(",");
        return new LatLng(Double.parseDouble(position[0]), Double.parseDouble(position[1]));
    }

    public void setType(String type) {
        try {
            this.type = Alert.Type.valueOf(type.replace(".","-").split("-")[1]);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
