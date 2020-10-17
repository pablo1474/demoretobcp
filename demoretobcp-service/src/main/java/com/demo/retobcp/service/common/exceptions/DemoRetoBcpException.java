package com.demo.retobcp.service.common.exceptions;

import lombok.Getter;

@Getter
public class DemoRetoBcpException extends Exception  {

    public DemoRetoBcpException() {
        super();
    }

    public DemoRetoBcpException(final String message) {
        super(message);
    }
}
