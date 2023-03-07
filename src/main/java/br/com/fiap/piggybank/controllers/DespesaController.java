package br.com.fiap.piggybank.controllers;

<<<<<<< HEAD

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.piggybank.controllers.models.Despesa;
=======
import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.piggybank.models.Despesa;
>>>>>>> 4dba961f19269e0ae944dc049a89d8d12c087d14
import java.time.LocalDate;

@RestController
public class DespesaController {

    @GetMapping("/api/despesas")
    public Despesa show(){
        var despesa = new Despesa(
<<<<<<< HEAD
                    new BigDecimal(100),
                    LocalDate.now(),
                    "cinema"
                );
        return despesa;
    }
=======
                    new BigDecimal(100), 
                    LocalDate.now(), 
                    "cinema"
                );
        
        return despesa;
    }

    
>>>>>>> 4dba961f19269e0ae944dc049a89d8d12c087d14
    
}
