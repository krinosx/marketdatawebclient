package com.giulianobortolassi.marketdata.Cotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class CotacaoController {

    @Autowired
    private CotacaoRepository repository;

    @Autowired
    private CotacaoListRepository listRepository;

    @RequestMapping("/api/cotacao/{dataPregao}/{id}")
    public Cotacao getCotacao( @PathVariable String dataPregao, @PathVariable String id ){
        return repository.findOne( new CotacaoId(dataPregao, id) );
    }

    @RequestMapping("/api/cotacao/{dataPregao}")
    public Iterable<CotacaoList> getCotacoesNegociadas(@PathVariable String dataPregao ) {
        LocalDate parsedDate = LocalDate.parse(dataPregao, DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) );
        return listRepository.findAllByDataPregao( DateTimeFormatter.ofPattern("yyyyMMdd").format( parsedDate ) );
    }

}
