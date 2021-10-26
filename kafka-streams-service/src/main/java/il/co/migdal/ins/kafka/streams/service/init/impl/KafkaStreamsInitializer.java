package il.co.migdal.ins.kafka.streams.service.init.impl;

import il.co.migdal.ins.kafka.config.KafkaConfigData;
import il.co.migdal.ins.kafka.admin.config.client.KafkaAdminClient;
import il.co.migdal.ins.kafka.streams.service.init.api.StreamsInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class KafkaStreamsInitializer implements StreamsInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaStreamsInitializer.class);

    private final KafkaConfigData kafkaConfigData;

    private final KafkaAdminClient kafkaAdminClient;

    public KafkaStreamsInitializer(KafkaConfigData configData, KafkaAdminClient adminClient) {
        this.kafkaConfigData = configData;
        this.kafkaAdminClient = adminClient;
    }

    @Override
    public void init() {
        kafkaAdminClient.checkTopicsCreated();
        kafkaAdminClient.checkSchemaRegistry();
        LOG.info("Topics with name {} is ready for operations!", kafkaConfigData.getTopicNamesToCreate().toArray());
    }
}
