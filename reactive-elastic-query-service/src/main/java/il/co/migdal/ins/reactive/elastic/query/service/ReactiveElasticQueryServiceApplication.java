package il.co.migdal.ins.reactive.elastic.query.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "il.co.migdal.ins")
public class ReactiveElasticQueryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveElasticQueryServiceApplication.class, args);
    }
}
