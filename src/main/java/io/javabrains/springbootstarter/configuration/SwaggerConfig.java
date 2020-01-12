package io.javabrains.springbootstarter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("io.javabrains.springbootstarter.topic"))
                .paths(regex("/topics.*"))
                .build();
    }
    
    /* This below method should not have been written
     * its just that our some jar dependency was failing so we had to write this manually
     */
    public static Predicate<String> regex(final String pathRegex) {
        return new Predicate<String>() {
          @Override
          public boolean apply(String input) {
            return input.matches(pathRegex);
          }
        };
      }
}
