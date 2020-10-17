package com.demo.retobcp.service.internal;

import com.demo.retobcp.domain.rr.request.TipoCambioRequest;
import com.demo.retobcp.domain.rr.response.TipoCambioResponse;
import com.demo.retobcp.entity.ExchangeCurrency;
import com.demo.retobcp.repository.ExchangeCurrencyRepository;
import com.demo.retobcp.service.RetoBcpService;
import com.demo.retobcp.service.common.exceptions.DemoRetoBcpException;
import org.springframework.stereotype.Service;
import rx.Single;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.List;

import static com.demo.retobcp.service.common.utils.Constants.*;

@Service
public class DefaultRetoBcpService implements RetoBcpService {


    private ExchangeCurrencyRepository exchangeCurrencyRepository;

    public DefaultRetoBcpService(ExchangeCurrencyRepository exchangeCurrencyRepository) {
        this.exchangeCurrencyRepository = exchangeCurrencyRepository;
    }

    @Override
    public Single<TipoCambioResponse> cambioMoneda(TipoCambioRequest request) {
        TipoCambioResponse tipoCambioResponse = new TipoCambioResponse();

        String tipoTx = request.getMonedaOrigen().equals(SOLES)?COMPRA:VENTA;
        String currency = request.getMonedaOrigen().equals(SOLES)?request.getMonedaDestino():request.getMonedaOrigen();
        String fecha = request.getFecha();

        return Single.create(x -> {
            BigDecimal exchangeCurrency = exchangeCurrencyRepository.consultaCambioMoneda(tipoTx,currency,fecha);
            if (currency==null || currency.isEmpty())
                x.onError(new DemoRetoBcpException("El valor del parámetro currency no puede ser nulo"));
            else{
                BigDecimal valorMonto=request.getMonto();
                BigDecimal valorMontoTotal=exchangeCurrency.multiply(valorMonto);
                tipoCambioResponse.setMonedaDestino(request.getMonedaDestino());
                tipoCambioResponse.setMonedaOrigen(request.getMonedaOrigen());
                tipoCambioResponse.setTipoCambio(exchangeCurrency);
                tipoCambioResponse.setMonto(valorMonto);
                tipoCambioResponse.setMontoTipoCambio(valorMontoTotal);
                x.onSuccess(tipoCambioResponse);
            }
        });
    }
}