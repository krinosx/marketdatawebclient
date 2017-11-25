package com.giulianobortolassi.marketdata.Cotacao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface CotacaoListRepository extends CrudRepository<CotacaoList, String> {

    Iterable<CotacaoList> findAllByDataPregao(String dataPregao);
}
