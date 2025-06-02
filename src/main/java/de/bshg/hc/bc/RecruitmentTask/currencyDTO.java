package de.bshg.hc.bc.RecruitmentTask;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class currencyDTO {
    String currency;
    String code;
    BigDecimal  price;
}
