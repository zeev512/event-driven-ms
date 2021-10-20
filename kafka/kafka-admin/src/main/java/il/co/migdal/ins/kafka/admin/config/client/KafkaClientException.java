package il.co.migdal.ins.kafka.admin.config.client;

/**
 * Exception class for Kafka client error situations.
 */
public class KafkaClientException extends RuntimeException {

    public KafkaClientException() {
    }

    public KafkaClientException(String message) {
        super(message);
    }

    public KafkaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
