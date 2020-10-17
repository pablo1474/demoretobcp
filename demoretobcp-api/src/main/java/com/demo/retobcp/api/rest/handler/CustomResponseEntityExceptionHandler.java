package com.demo.retobcp.api.rest.handler;

import com.demo.retobcp.domain.rr.response.TipoCambioResponse;
import com.demo.retobcp.service.common.exceptions.DemoRetoBcpException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Log4j2
public class CustomResponseEntityExceptionHandler {

    @ExceptionHandler(DemoRetoBcpException.class)
    public final ResponseEntity<TipoCambioResponse> handleAllExceptions(DemoRetoBcpException ex) {
        log.info("Accessing method handleAllExceptions WrapperTsecException ...");
        TipoCambioResponse errorDetails = new TipoCambioResponse();
        //errorDetails.setMensaje(ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
