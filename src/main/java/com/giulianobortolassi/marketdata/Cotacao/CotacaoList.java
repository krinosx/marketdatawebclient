package com.giulianobortolassi.marketdata.Cotacao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.giulianobortolassi.util.StringDateAttributeConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Uma lista de papeis negociados em um dia específico (apenas os codigos dos papeis)
 */
@Entity
@Table( name = "mdt_cotacao_historica" )
public class CotacaoList {

    @Column( name = "data_pregao", insertable = false, updatable = false )
    private String dataPregao;
    @Id
    @Column( name = "codigo_negocio", insertable = false, updatable = false )
    private String codigoNegociacao;

    @JsonIgnore
    public String getDataPregao() {
        return dataPregao;
    }

    public void setDataPregao(String dataPregao) {
        this.dataPregao = dataPregao;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }
}
