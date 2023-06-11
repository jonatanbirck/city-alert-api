package br.com.univates.citymobileapi.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Converter
public class ListLatLngFieldConverter implements AttributeConverter<List<LatLng>, String>, Serializable {

    private static final String DELIMITER = " - ";

    @Override
    public String convertToDatabaseColumn(List<LatLng> attribute) {
        if (CollectionUtils.isEmpty(attribute)) {
            return null;
        }
        StringBuilder data = new StringBuilder();
        for (LatLng latLng : attribute) {
            if (!data.isEmpty()) {
                data.append(DELIMITER);
            }
            data.append(map(latLng));
        }
        return data.toString();
    }

    @Override
    public List<LatLng> convertToEntityAttribute(String dbData) {
        if (Objects.isNull(dbData)) {
            return null;
        }
        String[] data = dbData.split(DELIMITER);
        List<LatLng> latLngList = new ArrayList<>(data.length);
        for (String datum : data) {
            latLngList.add(map(datum));
        }
        return latLngList;
    }


    private String map(LatLng attribute) {
        return String.format("%s, %s", attribute.latitude(), attribute.longitude());
    }

    private LatLng map(String dbData) {
        String[] data = dbData.split(",");
        return new LatLng(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
    }
}
