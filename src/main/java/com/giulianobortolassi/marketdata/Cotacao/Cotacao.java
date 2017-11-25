package com.giulianobortolassi.marketdata.Cotacao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.giulianobortolassi.util.PrecoStringToBigDecimalAttributeConverter;
import com.giulianobortolassi.util.StringDateAttributeConverter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table( name = "mdt_cotacao_historica")
public class Cotacao {

    @EmbeddedId
    CotacaoId id;

    @Column( name = "data_pregao", insertable = false, updatable = false )
    @Convert(converter = StringDateAttributeConverter.class )
    @JsonFormat( pattern = "yyy-MM-dd" )
    private LocalDate dataPregao;

    @Column( name = "codigo_negocio", insertable = false, updatable = false)
    private String codigoNegociacao;

    @Column( name = "codigo_isin")
    private String codigoIsin;

    @Column( name = "preco_abertura")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal precoAbertura;

    @Column( name = "preco_fechamento")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal precoFechamento;

    @Column( name = "preco_minimo")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal precoMinimo;

    @Column( name = "preco_medio")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal precoMedio;

    @Column( name = "preco_maximo")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal precoMaximo;

    @Column( name = "preco_melhor_ofc")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal melhorOfertaCompra;

    @Column( name = "preco_melhor_ofv")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal melhorOfertaVenda;

    @Column( name = "numero_de_negocios")
    //@Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private Long numeroNegocios;

    @Column( name = "quantidade_titulo_negociados")
    private Long quantidadeTitulosNegociados;

    @Column( name = "volume_total_negocios")
    @Convert( converter = PrecoStringToBigDecimalAttributeConverter.class )
    private BigDecimal volumeTotalNegocios;


    public LocalDate getDataPregao() {
        return dataPregao;
    }

    public void setDataPregao(LocalDate dataPregao) {
        this.dataPregao = dataPregao;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }

    public String getCodigoIsin() {
        return codigoIsin;
    }

    public void setCodigoIsin(String codigoIsin) {
        this.codigoIsin = codigoIsin;
    }

    public BigDecimal getPrecoAbertura() {
        return precoAbertura;
    }

    public void setPrecoAbertura(BigDecimal precoAbertura) {
        this.precoAbertura = precoAbertura;
    }

    public BigDecimal getPrecoFechamento() {
        return precoFechamento;
    }

    public void setPrecoFechamento(BigDecimal precoFechamento) {
        this.precoFechamento = precoFechamento;
    }

    public BigDecimal getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(BigDecimal precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public BigDecimal getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(BigDecimal precoMedio) {
        this.precoMedio = precoMedio;
    }

    public BigDecimal getPrecoMaximo() {
        return precoMaximo;
    }

    public void setPrecoMaximo(BigDecimal precoMaximo) {
        this.precoMaximo = precoMaximo;
    }

    public BigDecimal getMelhorOfertaCompra() {
        return melhorOfertaCompra;
    }

    public void setMelhorOfertaCompra(BigDecimal melhorOfertaCompra) {
        this.melhorOfertaCompra = melhorOfertaCompra;
    }

    public BigDecimal getMelhorOfertaVenda() {
        return melhorOfertaVenda;
    }

    public void setMelhorOfertaVenda(BigDecimal melhorOfertaVenda) {
        this.melhorOfertaVenda = melhorOfertaVenda;
    }

    public Long getNumeroNegocios() {
        return numeroNegocios;
    }

    public void setNumeroNegocios(Long numeroNegocios) {
        this.numeroNegocios = numeroNegocios;
    }

    public Long getQuantidadeTitulosNegociados() {
        return quantidadeTitulosNegociados;
    }

    public void setQuantidadeTitulosNegociados(Long quantidadeTitulosNegociados) {
        this.quantidadeTitulosNegociados = quantidadeTitulosNegociados;
    }

    public BigDecimal getVolumeTotalNegocios() {
        return volumeTotalNegocios;
    }

    public void setVolumeTotalNegocios(BigDecimal volumeTotalNegocios) {
        this.volumeTotalNegocios = volumeTotalNegocios;
    }
}
