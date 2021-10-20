package il.co.migdal.ins.kafkaelastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "il.co.migdal.ins")
public class KafkaElasticServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaElasticServiceApplication.class, args);
    }

}
