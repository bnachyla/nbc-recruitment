package de.bshg.hc.bc.RecruitmentTask;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CurrencytableDTO {
    private String table;
    private String no;
    private String effectiveDate;
    private List<currencyDTO> rates;
}
