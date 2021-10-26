package il.co.migdal.ins.kafka.streams.service;

import il.co.migdal.ins.kafka.streams.service.init.api.StreamsInitializer;
import il.co.migdal.ins.kafka.streams.service.runner.api.StreamsRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"il.co.migdal.ins"})
public class KafkaStreamsServiceApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaStreamsServiceApplication.class);

	private final StreamsRunner<String, Long> streamsRunner;

	private final StreamsInitializer streamsInitializer;

	public KafkaStreamsServiceApplication(StreamsRunner<String, Long> runner,
										  StreamsInitializer initializer) {
		this.streamsRunner = runner;
		this.streamsInitializer = initializer;
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamsServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOG.info("App starts...");
		streamsInitializer.init();
		streamsRunner.start();
	}

}
