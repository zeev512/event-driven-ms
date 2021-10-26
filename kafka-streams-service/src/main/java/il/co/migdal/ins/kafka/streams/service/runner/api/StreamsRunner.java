package il.co.migdal.ins.kafka.streams.service.runner.api;

public interface StreamsRunner<K, V> {
    void start();
    default V getValueByKey(K key) {
        return null;
    }
}
