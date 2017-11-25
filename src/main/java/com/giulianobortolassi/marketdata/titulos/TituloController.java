package com.giulianobortolassi.marketdata.titulos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TituloController {
    @Autowired
    private TituloRepository repository;

    @RequestMapping("/api/titulo/{id}")
    public Titulo getTitulo( @PathVariable(name = "id") String id ) {
        return repository.findOne( id );
    }
}
