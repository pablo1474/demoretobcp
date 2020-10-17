package com.demo.retobcp.domain.rr.request;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "monto",
        "monedaOrigen",
        "monedaDestino",
        "fecha"
})
public class TipoCambioRequest {

    @ApiModelProperty(notes = "Monto", example = "100", required = true, position = 1)
    @JsonProperty("monto")
    private BigDecimal monto = BigDecimal.ZERO;

    @ApiModelProperty(notes = "Moneda Origen", example = "PEN", required = true, position = 2)
    @JsonProperty("monedaOrigen")
    private String monedaOrigen = "";

    @ApiModelProperty(notes = "Moneda Destino", example = "USD", required = true, position = 3)
    @JsonProperty("monedaDestino")
    private String monedaDestino = "";

    @ApiModelProperty(notes = "fecha", example = "USD", required = true, position =4 )
    @JsonProperty("fecha")
    private String fecha = "";
}