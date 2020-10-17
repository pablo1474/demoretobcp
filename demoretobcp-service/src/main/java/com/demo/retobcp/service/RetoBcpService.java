package com.demo.retobcp.service;

import com.demo.retobcp.domain.rr.request.TipoCambioRequest;
import com.demo.retobcp.domain.rr.response.TipoCambioResponse;
import rx.Single;

public interface RetoBcpService {

    Single<TipoCambioResponse> cambioMoneda(TipoCambioRequest request);

}
