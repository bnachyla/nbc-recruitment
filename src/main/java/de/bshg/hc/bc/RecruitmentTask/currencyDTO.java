package de.bshg.hc.bc.RecruitmentTask;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class currencyDTO {
    String no;
    Date effectiveDate;
    BigDecimal  mid;
}
