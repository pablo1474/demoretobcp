package com.demo.retobcp.api.rest;

import com.demo.retobcp.domain.rr.request.*;
import com.demo.retobcp.domain.rr.response.*;
import com.demo.retobcp.service.RetoBcpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;

@AllArgsConstructor
@RestController
public class ApiController {

    private final RetoBcpService demoBcpService;

    @PostMapping(value = "/exchange")
    @ResponseBody
    public Single<TipoCambioResponse> cambio(@RequestBody TipoCambioRequest tipoCambioRequest) {
        return demoBcpService.cambioMoneda(tipoCambioRequest);
    }
}