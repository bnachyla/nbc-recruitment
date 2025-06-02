package de.bshg.hc.bc.RecruitmentTask;

import de.bshg.hc.bc.RecruitmentTask.nbp.NbpRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @Autowired
    NbpRestClient restClient;

    @GetMapping(value = "/tables", produces = "application/json")
    ResponseEntity<String> getCurrencyTables(){
        return restClient.getCurrencyTable("rates");
    }

    @GetMapping(value = "/rate", produces = "application/json")

    ResponseEntity<String> currencyRate(
            @RequestParam(name = "currency", defaultValue = "xyz") String currency
    ){
        return restClient.getCurrencyRate("a", currency);
    }

}
