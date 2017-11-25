package com.giulianobortolassi.marketdata.Cotacao;

import com.giulianobortolassi.util.StringDateAttributeConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Embeddable
public class CotacaoId implements Serializable {

    public CotacaoId(String dataPregao, String codigoNegociacao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dataPregao = LocalDate.parse( dataPregao, formatter );
        this.codigoNegociacao = codigoNegociacao;
    }
    @Column( name = "data_pregao", insertable = false, updatable = false )
    @Convert( converter = StringDateAttributeConverter.class )
    private LocalDate dataPregao;
    @Column( name = "codigo_negocio", insertable = false, updatable = false )
    private String codigoNegociacao;
}
