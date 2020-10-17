package com.demo.retobcp.domain.rr.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "monto",
        "montoTipoCambio",
        "monedaOrigen",
        "monedaDestino",
        "tipoCambio"
})
public class TipoCambioResponse {

    @ApiModelProperty(notes = "Monto", example = "100", required = true, position = 1)
    @JsonProperty("monto")
    private BigDecimal monto = BigDecimal.ZERO;

    @ApiModelProperty(notes = "Monto con Tipo de Cambio", example = "30.32", required = true, position = 2)
    @JsonProperty("montoTipoCambio")
    private BigDecimal montoTipoCambio = BigDecimal.ZERO;

    @ApiModelProperty(notes = "Moneda Origen", example = "PEN", required = true, position = 3)
    @JsonProperty("monedaOrigen")
    private String monedaOrigen = "";

    @ApiModelProperty(notes = "Moneda Destino", example = "USD", required = true, position = 4)
    @JsonProperty("monedaDestino")
    private String monedaDestino = "";

    @ApiModelProperty(notes = "Tipo de Cambio", example = "3.53", required = true, position = 5)
    @JsonProperty("tipoCambio")
    private BigDecimal tipoCambio = BigDecimal.ZERO;
}