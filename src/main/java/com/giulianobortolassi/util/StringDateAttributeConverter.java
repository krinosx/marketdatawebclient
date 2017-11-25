package com.giulianobortolassi.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Converter
public class StringDateAttributeConverter implements AttributeConverter<LocalDate, String> {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Override
    public String convertToDatabaseColumn( LocalDate date ) {
        return ( date == null ? null : date.format( formatter ) );
    }

    @Override
    public LocalDate convertToEntityAttribute( String sqlDate ) {
        return (sqlDate == null ? null : LocalDate.parse( sqlDate, formatter ) );
    }
}
