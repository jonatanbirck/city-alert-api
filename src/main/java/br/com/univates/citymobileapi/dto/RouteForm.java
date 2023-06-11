package br.com.univates.citymobileapi.dto;

import br.com.univates.citymobileapi.util.LatLng;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RouteForm {

    private String name;
    private List<AlertForm> alerts = new ArrayList<>();
    private List<LatLng> positions;
    private LatLng startPosition;
    private LatLng endPosition;

    public void setPositions(List<String> positions) {
        this.positions = toLatLng(positions);
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = toLatLng(startPosition);
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = toLatLng(endPosition);
    }

    private static LatLng toLatLng(String latLng) {
        latLng = latLng.replace("{", "");
        latLng = latLng.replace("}", "");
        String[] position = latLng.split(",");
        return new LatLng(Double.parseDouble(position[0]), Double.parseDouble(position[1]));
    }

    private static List<LatLng> toLatLng(List<String> latLngs) {
        List<LatLng> latLngs1 = new ArrayList<>(latLngs.size());
        for (String latLng : latLngs) {
            latLngs1.add(toLatLng(latLng));
        }
        return latLngs1;
    }

}
