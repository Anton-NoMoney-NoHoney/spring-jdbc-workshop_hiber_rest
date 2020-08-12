package org.shop.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("org.shop")
@ImportResource(value = {"classpath:spring/application-context.xml"})
public class ApplicationContextConfig {

}
