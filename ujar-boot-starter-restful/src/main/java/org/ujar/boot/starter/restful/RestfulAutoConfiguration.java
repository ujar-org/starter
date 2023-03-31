package org.ujar.boot.starter.restful;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.ujar.boot.restful.swagger.SwaggerConfiguration;
import org.ujar.boot.restful.web.WebConfig;

@Configuration
@Import(value = {
    WebConfig.class,
    SwaggerConfiguration.class
})
public class RestfulAutoConfiguration {
}
