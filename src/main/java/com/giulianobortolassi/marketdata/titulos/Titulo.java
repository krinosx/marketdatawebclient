package com.giulianobortolassi.marketdata.titulos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.giulianobortolassi.util.JavaTimeAttributeConverter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mdt.titulo")
public class Titulo {
    @Id
    @Column( name = "codigo_negociacao" )
    String codigoNegociacao;
    @Column( name = "codigo_isin" )
    String codigoIsin;
    @Column( name = "codigo_empresa" )
    String codigoEmpresa;
    @Column( name = "codigo_bdi_descricao" )
    String descricaoBdi;
    @Column( name = "descricao_mercado" )
    String mercado;
    @Column( name = "preco" )
    String preco;
    @Column( name = "descricao_tipo_moeda" )
    String simboloMoeda;
    @Column( name = "protecao" )
    String protecao;

    @Column( name = "codigo_isin_papel_objeto" )
    String codigoIsinPapelObjeto;
    @Column( name = "numero_serie_opcoes" )
    String opcaoNumeroSerie;
    @Column( name = "especificacao_papel_objeto" )
    String opcaoEspecificaoPapelObjeto;
    @Column( name = "data_vencimento_opcoes" )
    @Convert( converter = JavaTimeAttributeConverter.class )
    LocalDate opcaoDataVencimento;
    @Column( name = "estilo_opcao" )
    String opcaoEstilo;

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

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getDescricaoBdi() {
        return descricaoBdi;
    }

    public void setDescricaoBdi(String descricaoBdi) {
        this.descricaoBdi = descricaoBdi;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getSimboloMoeda() {
        return simboloMoeda;
    }

    public void setSimboloMoeda(String simboloMoeda) {
        this.simboloMoeda = simboloMoeda;
    }

    public String getProtecao() {
        return protecao;
    }

    public void setProtecao(String protecao) {
        this.protecao = protecao;
    }

    public String getCodigoIsinPapelObjeto() {
        return codigoIsinPapelObjeto;
    }

    public void setCodigoIsinPapelObjeto(String codigoIsinPapelObjeto) {
        this.codigoIsinPapelObjeto = codigoIsinPapelObjeto;
    }

    public String getOpcaoNumeroSerie() {
        return opcaoNumeroSerie;
    }

    public void setOpcaoNumeroSerie(String opcaoNumeroSerie) {
        this.opcaoNumeroSerie = opcaoNumeroSerie;
    }

    public String getOpcaoEspecificaoPapelObjeto() {
        return opcaoEspecificaoPapelObjeto;
    }

    public void setOpcaoEspecificaoPapelObjeto(String opcaoEspecificaoPapelObjeto) {
        this.opcaoEspecificaoPapelObjeto = opcaoEspecificaoPapelObjeto;
    }

    @JsonFormat( pattern = "yyyy-MM-dd")
    public LocalDate getOpcaoDataVencimento() {
        return opcaoDataVencimento;
    }

    public void setOpcaoDataVencimento(LocalDate opcaoDataVencimento) {
        this.opcaoDataVencimento = opcaoDataVencimento;
    }

    public String getOpcaoEstilo() {
        return opcaoEstilo;
    }

    public void setOpcaoEstilo(String opcaoEstilo) {
        this.opcaoEstilo = opcaoEstilo;
    }
}
