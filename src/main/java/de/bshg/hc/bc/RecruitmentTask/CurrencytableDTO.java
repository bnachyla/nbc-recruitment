package de.bshg.hc.bc.RecruitmentTask;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CurrencytableDTO {
    private String table;
    private String currency;
    private String code;
    private List<currencyDTO> rates;
}
