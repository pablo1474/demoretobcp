package com.demo.retobcp.api.config.properties;

import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Getter
@ToString
@Validated
public class AppProperties {
}
