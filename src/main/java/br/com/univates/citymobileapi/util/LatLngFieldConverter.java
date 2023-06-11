package br.com.univates.citymobileapi.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.io.Serializable;
import java.util.Objects;

@Converter
public class LatLngFieldConverter implements AttributeConverter<LatLng, String>, Serializable {

    @Override
    public String convertToDatabaseColumn(LatLng attribute) {
        if (Objects.isNull(attribute)) {
            return null;
        }
        return String.format("%s, %s", attribute.latitude(), attribute.longitude());
    }

    @Override
    public LatLng convertToEntityAttribute(String dbData) {
        if (Objects.isNull(dbData)) {
            return null;
        }
        String[] data = dbData.split(",");
        return new LatLng(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
    }

}
