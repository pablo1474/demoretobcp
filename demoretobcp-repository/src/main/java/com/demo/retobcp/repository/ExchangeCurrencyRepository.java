package com.demo.retobcp.repository;

import com.demo.retobcp.entity.ExchangeCurrency;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;

@Repository
public interface ExchangeCurrencyRepository extends CrudRepository<ExchangeCurrency, Long>{

    @Query(" SELECT ec.currencyValue FROM ExchangeCurrency  ec WHERE ec.codeExchange = ?1 and ec.codeCurrency = ?2 and ec.fecha = ?3 ")
    BigDecimal consultaCambioMoneda(String codeExchange, String codeCurrency, String fecha);

}
