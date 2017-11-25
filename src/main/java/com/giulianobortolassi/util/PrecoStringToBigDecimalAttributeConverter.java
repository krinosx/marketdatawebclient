package com.giulianobortolassi.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;


@Converter
public class PrecoStringToBigDecimalAttributeConverter implements AttributeConverter<BigDecimal, String> {

    @Override
    public String convertToDatabaseColumn(BigDecimal preco) {
        return ( preco == null ? null : preco.toPlainString() );
    }

    @Override
    public BigDecimal convertToEntityAttribute(String precoDatabase) {
        return ( precoDatabase == null ? null : new BigDecimal( precoDatabase ).movePointLeft( 2 ) );
    }
}
