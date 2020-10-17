package com.demo.retobcp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NaturalIdCache;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity(name = "ExchangeCurrency")
@Table(name = "EXCHANGE_CURRENCY")
@DynamicUpdate
@NaturalIdCache
public class ExchangeCurrency implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private int id = 0;

    @Column(name = "CODE_CURRENCY" ,nullable = false, updatable = false)
    private String codeCurrency = "";

    @Column(name = "CODE_EXCHANGE" ,nullable = false, updatable = false )
    private String codeExchange ="";

    @Column(name = "VALUE_CURRENCY" , nullable = false)
    private BigDecimal currencyValue = BigDecimal.ZERO;

    @Column(name = "FECHA" , nullable = false)
    private String fecha ="";

    @Column(name = "UPDATE_DATE", nullable = false)
    private String updateDate ="";
}
