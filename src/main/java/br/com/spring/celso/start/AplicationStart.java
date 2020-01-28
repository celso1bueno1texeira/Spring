package br.com.spring.celso.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Celso Bueno, 28/01/2020
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.spring.celso.endpoint")
class ApplicationStart {
    public static void main(String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}
